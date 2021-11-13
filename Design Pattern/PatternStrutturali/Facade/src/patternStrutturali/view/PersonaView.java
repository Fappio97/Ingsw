package patternStrutturali.view;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import patternStrutturali.Impostazioni;
import patternStrutturali.model.NomiCampi;
import patternStrutturali.model.NomiPersone;

public class PersonaView {
	private Image[] persone;
	private static PersonaView personaView = null;
	
	private PersonaView() {
		persone = new Image[NomiPersone.getNomiPersone().getPersone().size()];
		
		try {
			
			for(int i = 0; i < NomiPersone.getNomiPersone().getPersone().size(); ++i) {
				persone[i] = ImageIO.read(getClass().getResource("/patternStrutturali/resources/persone/" + NomiPersone.getNomiPersone().getPersone().get(i) + ".png"));
				persone[i].getScaledInstance(Impostazioni.DIM_PERSONA, Impostazioni.DIM_PERSONA, Image.SCALE_SMOOTH);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static PersonaView getIstance() {
		if(personaView == null)
			personaView = new PersonaView();
		return personaView;
	}
	
	Image getImmagine(int i) {
		return persone[i];
	}
}
