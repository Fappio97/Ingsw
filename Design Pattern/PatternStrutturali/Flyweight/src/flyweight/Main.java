package flyweight;

import java.awt.Dimension;
import javax.swing.JFrame;

import flyweight.view.Pannello;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Flyweight");
		f.setSize(800, 800);	
		
		Pannello p = new Pannello();
		f.add(p);
		
		f.setMinimumSize(new Dimension(800, 800));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}