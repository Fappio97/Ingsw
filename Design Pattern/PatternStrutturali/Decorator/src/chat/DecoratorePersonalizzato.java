package chat;

public class DecoratorePersonalizzato extends Decoratore{

	public DecoratorePersonalizzato(Parola a) {
		super(a);
	}
	
	@Override
	public String stampa() {
		return super.stampa() + " il clown";
	}
	
}
