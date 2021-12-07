package memento;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Memento");
		f.setSize(400, 400);
		f.setMinimumSize(new Dimension(250, 250));
		f.setResizable(true);
	
		f.add(new PannelloPrincipale());
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
