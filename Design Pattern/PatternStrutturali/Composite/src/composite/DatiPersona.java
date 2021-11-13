package composite;

public interface DatiPersona {
	
	public String nome();
	public String cognome();
	public String sesso();
	public void aggiungi(DatiPersona p);
	public void rimuovi(DatiPersona p);
	public void stampa();
    
}