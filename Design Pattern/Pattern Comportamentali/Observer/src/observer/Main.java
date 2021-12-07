package observer;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;

public class Main {
	
	public static int x = 0;
	
	public static int getIdUtente() {
		return x ++;
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Observer");
		f.setSize(400, 400);	
		
		f.add(Publisher.getPublisher());
		
		Publisher.getPublisher().aggiungiSubscriber(new ArrayList<Subscriber>(Arrays.asList(new Chat("Marco"), new Chat("Giulia"), new Chat("Fabio"))));
		
		Publisher.getPublisher().rimuoviDallaChat(Publisher.getPublisher().getSubscriber().get(0).getIdSubscriber());
		
		f.setMinimumSize(new Dimension(400, 400));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
