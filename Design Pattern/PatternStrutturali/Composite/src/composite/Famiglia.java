package composite;

import java.util.ArrayList;
import java.util.List;

public class Famiglia implements DatiPersona {
	
	String cognomeFamiglia;
	
	public Famiglia(String cognomeFamiglia) {
		this.cognomeFamiglia = cognomeFamiglia;
	}
	
	protected List<DatiPersona> figli = new ArrayList<DatiPersona>();


	public List<DatiPersona> getFigli() {
		return figli;
	}

	@Override
	public String nome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cognome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sesso() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aggiungi(DatiPersona p) {
		// TODO Auto-generated method stub
		figli.add(p);
	}

	@Override
	public void rimuovi(DatiPersona p) {
		// TODO Auto-generated method stub
		figli.remove(p);
	}

	@Override
	public void stampa() {
		// TODO Auto-generated method stub
		System.out.println("Famiglia " + cognomeFamiglia + " composta da:");
		for(DatiPersona i : figli) {
			if(i instanceof Famiglia)
				System.out.print("	+ ");
			else
				System.out.print("		- ");
			i.stampa();
		}
	}

}
