package composite;

public class Main {
	public static void main(String[] args) {
		
		Dati cangeri = new Famiglia("Cangeri");
		Dati rossi = new Famiglia("Rossi");
		Dati stato = new Famiglia("Stato Italiano");
		
		Dati mr = new Persona("Mario", "Rossi", true);
		Dati gv = new Persona("Giulia", "Verdi", false);
		Dati bb = new Persona("Bruno", "Bianchi", true);
		Dati fc = new Persona("Fabio", "Cangeri", true);
		
		cangeri.aggiungi(fc);
		rossi.aggiungi(bb);
		rossi.aggiungi(gv);
		rossi.aggiungi(mr);
		
		stato.aggiungi(cangeri);
		stato.aggiungi(rossi);
		
		stato.stampa();
		
	}
}
