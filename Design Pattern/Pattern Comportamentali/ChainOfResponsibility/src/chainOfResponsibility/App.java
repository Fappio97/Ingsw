package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class App {
	private List<Documento> documenti;
	private List<Stampante> stampanti;
	
	private static App app = null;
	
	private App() {
		documenti = new ArrayList<Documento>();
		stampanti = new ArrayList<Stampante>();
	}
	
	public void aggiungiStampante(Stampante s) {
		getStampanti().add(s);
		if(getStampanti().size() - 2 >= 0)
			getStampanti().get(getStampanti().size() - 2).prossimaStampante(s);
	}

	public boolean stampa(Integer indice) {
		return getStampanti().get(0).stampa(documenti.get(indice));
	}

	public static App getApp() {
		if(app == null)
			app = new App();
		return app;
	}

	public List<Documento> getDocumenti() {
		return documenti;
	}

	public List<Stampante> getStampanti() {
		return stampanti;
	}

	public void stampantiLibere() {
		for(var i : stampanti) {
			i.occupata = false;
		}
	}

}
