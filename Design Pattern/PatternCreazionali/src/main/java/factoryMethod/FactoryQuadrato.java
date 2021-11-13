package factoryMethod;

import java.util.List;

public class FactoryQuadrato extends Factory {

	@Override
	public FiguraGeometrica getFigura(String tipo, List<Integer> dimensioni) {
		
		FiguraGeometrica f = null;
		
		if(tipo.equalsIgnoreCase("quadrato")) {
			try {
				if(dimensioni.size() != 1)
					throw new Exception("Devi inserire una sola dimensione!!!");
				f = new Quadrato(dimensioni.get(0));
			} catch(Exception e) {
				System.out.println(e.getMessage() + "\n");
			}
		}
		return f;
	}

}
