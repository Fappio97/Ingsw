package memento;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Immagini {
	
	private static Immagini immagini = null;
	private Image undo;
	private Image resume;
	private Image save;
	
	private Immagini() {
		try {
			undo = ImageIO.read(getClass().getResource("/memento/resources/undo.png"));
			resume = ImageIO.read(getClass().getResource("/memento/resources/resume.png"));
			save = ImageIO.read(getClass().getResource("/memento/resources/save.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Immagini getImmagini() {
		if(immagini == null)
			immagini = new Immagini();
		return immagini;
	}

	public Image getUndo() {
		return undo;
	}

	public Image getResume() {
		return resume;
	}

	public Image getSave() {
		return save;
	}
	
}
