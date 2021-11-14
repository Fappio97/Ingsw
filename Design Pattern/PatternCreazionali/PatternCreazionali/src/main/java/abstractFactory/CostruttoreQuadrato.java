package abstractFactory;

import java.util.ArrayList;

public class CostruttoreQuadrato extends AbstractFactory {

	@Override
	public FiguraGeometrica getPerimetro(ArrayList<Integer> dimensioni) {
		
		FiguraGeometrica f = null;
		
		try {
			if(dimensioni.size() != 1)
				throw new Exception("Devi inserire una sola dimensione!!!");
			f = new PerimetroQuadrato(dimensioni.get(0));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return f;
	}

	@Override
	public FiguraGeometrica getFigura(ArrayList<Integer> dimensioni) {
		
		FiguraGeometrica f = null;
		
		try {
			if(dimensioni.size() != 1)
				throw new Exception("Devi inserire una sola dimensione!!!");
			f = new Quadrato(dimensioni.get(0));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return f;
	}
}
