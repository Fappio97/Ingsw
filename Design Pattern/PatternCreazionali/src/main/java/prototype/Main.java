package prototype;

public class Main {
	public static void main(String[] args) {
		Prototype.caricaFigure();

		FiguraGeometrica clonedFiguraGeometrica = Prototype.getFigura(1);
		clonedFiguraGeometrica.stampaFigura();		

		FiguraGeometrica clonedFiguraGeometrica2 = Prototype.getFigura(2);
		clonedFiguraGeometrica2.stampaFigura();	
	}
}
