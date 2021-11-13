package adapter;

public class Target {
	
	public String testo;
	
	public Target() {
		
	}
	
	public Target (String testo) {
		this.testo = testo;
	}
	
	
	public String stampa() {
		return testo;
	}
}
