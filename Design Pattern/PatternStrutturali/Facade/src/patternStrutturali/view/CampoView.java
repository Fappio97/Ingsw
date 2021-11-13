package patternStrutturali.view;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

import patternStrutturali.Impostazioni;
import patternStrutturali.model.NomiCampi;

public class CampoView {

	private Image[] campo;
	private static CampoView campoView = null;
	
	private CampoView() {
		campo = new Image[NomiCampi.getNomiCampi().getCampi().size()];
		
		try {
			
			for(int i = 0; i < NomiCampi.getNomiCampi().getCampi().size(); ++i) {
				campo[i] = ImageIO.read(getClass().getResource("/patternStrutturali/resources/campo/" + NomiCampi.getNomiCampi().getCampi().get(i) + ".jpg"));
				campo[i].getScaledInstance(Impostazioni.DIM_CAMPO_1, Impostazioni.DIM_CAMPO_2, Image.SCALE_SMOOTH);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static CampoView getIstance() {
		if(campoView == null)
			campoView = new CampoView();
		return campoView;
	}
	
	Image getImmagine(int i) {
		return campo[i];
	}
	
}
