package adapter;

public class Adapter extends Target {
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	private Adaptee adaptee;
	
	
	public String stampa() {
		String a = "";
		for(int i : adaptee.stampa()) {
			a += String.valueOf( (char) i);
		}
		return a;
	}
}
