package patternStrutturali.model;

public class Campo {
	public boolean occupato;
	public String nome;
	
	public Campo(String nome) {
		super();
		this.nome = nome;
		this.occupato = false;
	}
	
	public void setOccupato(boolean occupato) {
		this.occupato = occupato;
	}
	
}
