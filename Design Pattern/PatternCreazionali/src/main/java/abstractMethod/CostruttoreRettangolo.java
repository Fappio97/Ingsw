package abstractMethod;

import java.util.ArrayList;

public class CostruttoreRettangolo extends AbstractFactory {

	@Override
	public FiguraGeometrica getFigura(ArrayList<Integer> dimensioni) {
		FiguraGeometrica f = null;
		
		try {
			if(dimensioni.size() != 2)
				throw new Exception("Devi inserire due dimensioni");
			return new Rettangolo(dimensioni.get(0), dimensioni.get(1));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return f;
	}

	@Override
	public FiguraGeometrica getPerimetro(ArrayList<Integer> dimensioni) {
		FiguraGeometrica f = null;
		
		try {
			if(dimensioni.size() != 2)
				throw new Exception("Devi inserire due dimensioni");
			return new PerimetroRettangolo(dimensioni.get(0), dimensioni.get(1));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return f;
	}
	
}
