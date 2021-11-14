package composite;

public interface Dati {
	
	public String nome();
	public String cognome();
	public String sesso();
	public void aggiungi(Dati p);
	public void rimuovi(Dati p);
	public void stampa();
    
}