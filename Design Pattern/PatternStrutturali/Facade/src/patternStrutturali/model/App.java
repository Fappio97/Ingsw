package patternStrutturali.model;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public List<Campo> campi;
	public Integer indexCampi;
	public List<Persona> persone;
	public Integer indexPersona1;
	public Integer indexPersona2;
	
	public App() {
		istanziaCampi();
		istanziaPersone();
		indexCampi = 0;
	}
	
	private void istanziaPersone() {
		persone = new ArrayList<Persona>();
		for(int i = 0; i < NomiPersone.getNomiPersone().getPersone().size(); ++i)
			persone.add(new Persona(NomiPersone.getNomiPersone().getPersone().get(i)));
		indexPersona1 = 0;
		indexPersona2 = 1;
	}

	private void istanziaCampi() {
		campi = new ArrayList<Campo>();
		for(int i = 0; i < NomiCampi.getNomiCampi().getCampi().size(); ++i) 
			campi.add(new Campo(NomiCampi.getNomiCampi().getCampi().get(i)));
	}
	
}
