package adapter;

import java.util.ArrayList;
import java.util.List;

public class Adaptee {
	
	private List<Integer> testo;
	
	public Adaptee(List<Integer> list) {
		testo = new ArrayList<Integer>();
		this.testo = list;
	}
	
	public List<Integer> stampa() {
		return testo;
	}
}
