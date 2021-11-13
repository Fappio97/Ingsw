package abstractMethod;

public class PerimetroQuadrato implements FiguraGeometrica {
	
	int lato;
	
	public PerimetroQuadrato(int lato) {
		this.lato = lato;
	}
	
	@Override
	public void stampaFigura() {
		System.out.println("Perimetro quadrato " + lato * 4);
	}
}
