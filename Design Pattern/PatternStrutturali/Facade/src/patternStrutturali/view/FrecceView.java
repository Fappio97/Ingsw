package patternStrutturali.view;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import patternStrutturali.Impostazioni;

public class FrecceView {
	
	private Image[] frecce;
	private static FrecceView frecceView = null;
	
	private FrecceView() {
		frecce = new Image[2];
		
		try {
			
			for(int i = 0; i < 2; ++i) {
				frecce[i] = ImageIO.read(getClass().getResource("/patternStrutturali/resources/frecce/" + i + ".png"));
				frecce[i].getScaledInstance(Impostazioni.DIM_FRECCE / 2, Impostazioni.DIM_FRECCE / 2, Image.SCALE_SMOOTH);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static FrecceView getIstance() {
		if(frecceView == null)
			frecceView = new FrecceView();
		return frecceView;
	}
	
	ImageIcon getImmagine(int i) {
		return new ImageIcon(frecce[i]);
	}
}
