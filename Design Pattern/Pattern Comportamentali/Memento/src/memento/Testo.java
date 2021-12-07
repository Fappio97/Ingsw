package memento;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.awt.event.KeyAdapter;

import javax.swing.JTextArea;

public class Testo extends JTextArea {

	private static final long serialVersionUID = 6671476234161562111L;
	
	private String parola = "";
	private Stack<Memento> undo;
	private Stack<Memento> resume;

	private static Testo testo = null;
	
	private Testo() {
		
		undo = new Stack<Memento>();
		resume = new Stack<Memento>();
		undo.push(new Memento(""));
		
//		parola = new Stack<Character>();
//		resume = new Stack<Character>();
		
		this.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
				//SERVE?
/*				if(e.getKeyCode() == KeyEvent.VK_ENTER)
					parola.push('\n');
				else if(e.getKeyCode() >= 0 && e.getKeyCode() <= 255)
					parola.push(e.getKeyChar());
				Testo.getTesto().resume.clear();*/
				
				if(e.getKeyCode() >= 0 && e.getKeyCode() <= 255) {
					parola += e.getKeyChar();
					undo.push(new Memento(parola));
					if(!resume.isEmpty())
						resume.clear();
				}
				
			}
		});
	}
/*	
	public void togliCarattere() {
		resume.push(parola.pop());
		this.setText(this.getText().substring(0, this.getText().length() - 1));
	}
	
	public void mettiCarattere() {
		parola.push(resume.pop());
		this.setText(this.getText() + parola.lastElement());
	}
*/

	public Memento salvaStato(){
		return new Memento(parola);
	}

	public void statoIndietro(){
		if(!undo.isEmpty()) {
			System.out.println(undo.size());
			
			String p = undo.pop().getParola();
			if(resume.isEmpty()) {
				resume.push(new Memento(p));
				parola = undo.pop().getParola();
			}
			else
				parola = p;
			
			resume.push(new Memento(parola));
			this.setText(parola);
		}
	}
	
	public void statoAvanti(){
		if(!resume.isEmpty()) {
			
			String p = resume.pop().getParola();
			
			if(p.equals("")) {
				undo.push(new Memento(p));
				parola = resume.pop().getParola();
			}
			else
				parola = p;			
			
			undo.push(new Memento(parola));
			this.setText(parola);
		}
	}
	
	public static Testo getTesto() {
		if(testo == null)
			testo = new Testo();
		return testo;
	}
/*
	public Stack<Character> getParola() {
		return parola;
	}

	public Stack<Character> getResume() {
		return resume;
	}
*/
	
	public String getParola() {
		return parola;
	}
	
}
