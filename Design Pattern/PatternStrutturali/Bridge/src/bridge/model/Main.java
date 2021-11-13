package bridge.model;

import javax.swing.JFrame;

import bridge.view.MainPanel;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Bridge");
		f.setSize(Impostazioni.DIMENSIONE_SCHERMO_1, Impostazioni.DIMENSIONE_SCHERMO_2);
		f.setResizable(false);
		
		MainPanel p = new MainPanel();
		p.setFocusable(true);
		f.add(p);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
