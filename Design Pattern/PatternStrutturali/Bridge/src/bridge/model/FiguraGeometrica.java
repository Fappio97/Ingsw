package bridge.model;

import java.util.List;

public abstract class FiguraGeometrica {

	public Colore colore;
	public String nome;
	
	public abstract List<Integer> dimensioni();
}
