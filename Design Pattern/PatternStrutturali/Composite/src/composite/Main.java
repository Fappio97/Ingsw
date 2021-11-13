package composite;

public class Main {
	public static void main(String[] args) {
		
		DatiPersona cangeri = new Famiglia("Cangeri");
		DatiPersona rossi = new Famiglia("Rossi");
		DatiPersona stato = new Famiglia("Stato Italiano");
		
		DatiPersona mr = new Persona("Mario", "Rossi", true);
		DatiPersona gv = new Persona("Giulia", "Verdi", false);
		DatiPersona bb = new Persona("Bruno", "Bianchi", true);
		DatiPersona fc = new Persona("Fabio", "Cangeri", true);
		
		cangeri.aggiungi(fc);
		rossi.aggiungi(bb);
		rossi.aggiungi(gv);
		rossi.aggiungi(mr);
		
		stato.aggiungi(cangeri);
		stato.aggiungi(rossi);
		
		stato.stampa();
		
	}
}
