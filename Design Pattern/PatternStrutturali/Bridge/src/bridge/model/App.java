package bridge.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
	private List<Colore> colori;
	private Map<String, FiguraGeometrica> figure;
	private static App app = null;
	public String attualeFigura;
	
	private App() {
		colori = new ArrayList<Colore>();
		colori.add(new Rosso());
		colori.add(new Blu());
		figure = new HashMap<String, FiguraGeometrica>();
		
		Quadrato q = new Quadrato(Impostazioni.DIM_QUADRATO);
		figure.put(q.nome, q);
		
		Rettangolo r = new Rettangolo(Impostazioni.DIM_RETTANGOLO_1, Impostazioni.DIM_RETTANGOLO_2);
		figure.put(r.nome, r);
	}

	public static App getApp() {
		if(app == null)
			app = new App();
		return app;
	}

	public List<Colore> getColori() {
		return colori;
	}

	public Map<String, FiguraGeometrica> getFigure() {
		return figure;
	}	
	
}
