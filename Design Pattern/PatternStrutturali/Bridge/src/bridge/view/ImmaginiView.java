package bridge.view;

import java.awt.Image;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import bridge.model.App;


public class ImmaginiView {
	
	private static ImmaginiView immaginiView = null;
	public Map<String, Image> img;
	
	private ImmaginiView() {
		img = new HashMap<String, Image>();
		try {
			img.put("quadrato blu", ImageIO.read(getClass().getResource("/bridge/resources/quadratoBlu.png")).getScaledInstance(App.getApp().getFigure().get("Quadrato").dimensioni().get(0), App.getApp().getFigure().get("Quadrato").dimensioni().get(0), Image.SCALE_SMOOTH));
			img.put("quadrato rosso", ImageIO.read(getClass().getResource("/bridge/resources/quadratoRosso.png")).getScaledInstance(App.getApp().getFigure().get("Quadrato").dimensioni().get(0), App.getApp().getFigure().get("Quadrato").dimensioni().get(0), Image.SCALE_SMOOTH));
			img.put("rettangolo blu", ImageIO.read(getClass().getResource("/bridge/resources/rettangoloBlu.png")).getScaledInstance(App.getApp().getFigure().get("Rettangolo").dimensioni().get(0), App.getApp().getFigure().get("Rettangolo").dimensioni().get(1), Image.SCALE_SMOOTH));
			img.put("rettangolo rosso", ImageIO.read(getClass().getResource("/bridge/resources/rettangoloRosso.png")).getScaledInstance(App.getApp().getFigure().get("Rettangolo").dimensioni().get(0), App.getApp().getFigure().get("Rettangolo").dimensioni().get(1), Image.SCALE_SMOOTH));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ImmaginiView getIstance() {
		if(immaginiView == null)
			immaginiView = new ImmaginiView();
		return immaginiView;
	}
}
