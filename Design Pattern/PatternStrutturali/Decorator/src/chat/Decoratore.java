package chat;

public class Decoratore implements Parola {

	private Parola parola;
	
	public Decoratore(Parola parola) {
		this.parola = parola;
	}

	@Override
	public String stampa() {
		return parola.stampa();
	}

}
