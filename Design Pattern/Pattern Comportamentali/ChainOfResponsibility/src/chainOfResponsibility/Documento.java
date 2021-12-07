package chainOfResponsibility;

public class Documento {
	
	private boolean colori;
	private String dimensione;
	
	public boolean isColori() {
		return colori;
	}

	public String getDimensione() {
		return dimensione;
	}

	public Documento(boolean colori, String dimensione) {
		super();
		this.colori = colori;
		this.dimensione = dimensione;
	}
	
	@Override
	public String toString() {
		String a = "Documento " + dimensione + " "; 
		a += !colori ? "bianco e nero" : "a colori";
		return a;
	}
	
}
