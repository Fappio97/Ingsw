package composite;

public class Persona implements DatiPersona {
	
	private String nome;
	private String cognome;
	private boolean maschio;
	
	public Persona(String nome, String cognome, boolean maschio) {
		this.nome = nome;
		this.cognome = cognome;
		this.maschio = maschio;
	}

	@Override
	public void stampa() {
		String sesso = maschio ? "maschio" : "femmina";
		System.out.println("Persona " + cognome + " " + nome + " " + sesso);
	}

	@Override
	public String nome() {
		return nome;
	}

	@Override
	public String cognome() {
		return cognome;
	}

	@Override
	public String sesso() {
		return maschio ? "maschio" : "femmina";
	}

	@Override
	public void aggiungi(DatiPersona p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rimuovi(DatiPersona p) {
		// TODO Auto-generated method stub
		
	}
	
}
