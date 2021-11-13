package abstractMethod;

import java.util.ArrayList;

public abstract class AbstractFactory {
	
	public abstract FiguraGeometrica getFigura(ArrayList<Integer> dimensioni);
	public abstract FiguraGeometrica getPerimetro(ArrayList<Integer> dimensioni);
}
