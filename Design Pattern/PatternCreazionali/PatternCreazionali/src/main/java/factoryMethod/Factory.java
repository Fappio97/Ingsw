package factoryMethod;

import java.util.List;


public abstract class Factory {
	
	public abstract FiguraGeometrica getFigura(String tipo, List<Integer> dimensioni);

}
