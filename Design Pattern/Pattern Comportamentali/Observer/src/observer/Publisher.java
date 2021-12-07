package observer;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTabbedPane;

public class Publisher extends JTabbedPane {

	private static final long serialVersionUID = 6353972211621719482L;
	private static Publisher publisher = null;
	private List<Subscriber> subscriber;

	private Publisher() {	
		subscriber = new ArrayList<Subscriber>();
	}

	
	public void aggiungiSubscriber(ArrayList<Subscriber> subscriber) {
		this.subscriber = subscriber;
		
		aggiungiTab();
	}

	private void aggiungiTab() {
		// TODO Auto-generated method stub
		for(var i : getSubscriber()) 
			this.addTab(i.getNome(), (Component) i);
	}
	
	public void rimuoviDallaChat(Integer id) {
		for(int i = 0; i < subscriber.size(); ++i) {
			if(subscriber.get(i).getIdSubscriber() == id) {
				subscriber.remove(i);
				this.remove(i);
				return;
			}
		}
	}
	
	public void notificaChat(String testo, Integer id) {
		
		for(var i : subscriber)
			if(i.getIdSubscriber() != id)
				i.notifica(testo);
	}
	
	public void setColor() {
		this.setBackground(Color.RED);
	}

	public List<Subscriber> getSubscriber() {
		return subscriber;
	}

	public static Publisher getPublisher() {
		if(publisher == null)
			publisher = new Publisher();
		return publisher;
	}
	
}
