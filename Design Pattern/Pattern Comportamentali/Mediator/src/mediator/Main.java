package mediator;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Mediator");
		f.setSize(800, 600);
		
		Mediator m = new Form();
		f.add(m.creaPannello());
		
		f.setMinimumSize(new Dimension(800, 600));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
