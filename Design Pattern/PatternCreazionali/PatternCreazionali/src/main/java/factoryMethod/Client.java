package factoryMethod;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		Factory costruttore = new FactoryQuadrato();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(6);
		lista.add(2);
		FiguraGeometrica f = costruttore.getFigura("rEtTaNgOlO", lista);
		if(f != null)
			f.stampaFigura();
		
		lista.remove(1);
		f = costruttore.getFigura("QuadratO", lista);
		if(f != null)
			f.stampaFigura();
		
		lista.add(2);
		f = costruttore.getFigura("QuadratO", lista);
		if(f != null)
			f.stampaFigura();
		
		costruttore = new FactoryRettangolo();
		f = costruttore.getFigura("rEtTaNgOlO", lista);
		if(f != null)
			f.stampaFigura();
		
		lista.remove(1);
		f = costruttore.getFigura("rEtTaNgOlO", lista);
		if(f != null)
			f.stampaFigura();
		
		
		f = costruttore.getFigura("QuadratO", lista);
		if(f != null)
			f.stampaFigura();
	}

}
