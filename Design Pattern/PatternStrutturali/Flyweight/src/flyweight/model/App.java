package flyweight.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	
	private static App app = null;
	private List<Pallina> palline;
	
	public List<Pallina> getPalline() {
		return palline;
	}

	private App() {
		palline = new ArrayList<Pallina>();
	}
	
	public void aggiungiPallina(int x, int y, String nome, Color colore) {
		palline.add(new Pallina(x, y, CreatoreTipoPalline.getPallina(nome, colore)));
	}

	public static App getApp() {
		if(app == null)
			app = new App();
		return app;
	}		
}
