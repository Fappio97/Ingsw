package chat;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Chat ristretta");
		f.setTitle("Chat");
		f.setSize(400, 400);	
		Chat chat = new Chat();
		f.add(chat);
		f.setMinimumSize(new Dimension(400, 400));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
