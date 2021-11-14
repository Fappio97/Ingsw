package proxy;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Proxy");
		f.setSize(800, 600);
		
		Pannello p = new Pannello();
		f.add(p);
		
		f.setMinimumSize(new Dimension(400, 400));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
