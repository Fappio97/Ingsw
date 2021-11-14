package factoryMethod;

import java.util.List;

public class FactoryRettangolo extends Factory {

	@Override
	public FiguraGeometrica getFigura(String tipo, List<Integer> dimensioni) {
		
		FiguraGeometrica f = null;
		
		if(tipo.equalsIgnoreCase("rettangolo")) { 
			try {
				if(dimensioni.size() != 2)
					throw new Exception("Devi inserire due dimensioni");
				f = new Rettangolo(dimensioni.get(0), dimensioni.get(1));
			} catch(Exception e) {
				System.out.println(e.getMessage() + "\n");
			}
		}
		return f;
	}

}
