package chat;

public class ParolaConcreta implements Parola {

	private String parola;
	
	public ParolaConcreta(String parola) {
		this.parola = parola;
	}
	
	@Override
	public String stampa() {
		return parola;
	}
	
}
