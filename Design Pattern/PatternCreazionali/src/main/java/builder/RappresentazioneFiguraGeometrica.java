package builder;

import java.util.ArrayList;
import java.util.List;

public class RappresentazioneFiguraGeometrica {
	
	List<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
	
	public void aggiungiElemento(FiguraGeometrica f) {
		lista.add(f);
	}
	
	public void stampaElementi() {
		for(FiguraGeometrica i : lista) {
			i.stampaFigura();
		}
	}
}
