package chat;

public class DecoratoreOffensivo extends Decoratore {

	public DecoratoreOffensivo(Parola a) {
		super(a);
	}

	@Override
	public String stampa() {
		String stringa = super.stampa().substring(0, 1);
		for(int i = 1; i < super.stampa().length(); ++i)
			stringa += "*";
		return stringa;
	}

}
