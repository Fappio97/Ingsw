package memento;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import memento.control.SalvaFile;

public class PannelloSuperiore extends JPanel {

	private static final long serialVersionUID = -750781069235689769L;
	private JButton undo;
	private JButton resume;
	private JButton save;
	private JSeparator spazio;
	
	public PannelloSuperiore() {
		// TODO Auto-generated constructor stub
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		
		undo = new JButton(new ImageIcon(Immagini.getImmagini().getUndo()));
		undo.setMaximumSize(new Dimension(40, 40));
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Testo.getTesto().statoIndietro();
			}
		});
		
		spazio = new JSeparator();
		
		resume = new JButton(new ImageIcon(Immagini.getImmagini().getResume()));
		resume.setMaximumSize(new Dimension(40, 40));
		resume.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Testo.getTesto().statoAvanti();
			}
			
		});
		
		save = new JButton(new ImageIcon(Immagini.getImmagini().getSave()));
		save.setMaximumSize(new Dimension(40, 40));
		save.addActionListener(new SalvaFile());
		
		this.add(undo);
		this.add(resume);
		this.add(spazio);
		this.add(save);
	}

}
