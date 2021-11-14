package abstractFactory;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		
		AbstractFactory a = new CostruttoreRettangolo();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(6);
		lista.add(2);
		FiguraGeometrica f = a.getFigura(lista);
		if(f != null)
			f.stampaFigura();
		
		f = a.getPerimetro(lista);
		if(f != null)
			f.stampaFigura();
		
		lista.remove(1);
		
		a = new CostruttoreQuadrato();
		f = a.getFigura(lista);
		if(f != null)
			f.stampaFigura();
		
		f = a.getPerimetro(lista);
		if(f != null)
			f.stampaFigura();
		
		lista.add(2);
		f = a.getFigura(lista);
		if(f != null)
			f.stampaFigura();
		
		f = a.getPerimetro(lista);
		if(f != null)
			f.stampaFigura();
	}

}
