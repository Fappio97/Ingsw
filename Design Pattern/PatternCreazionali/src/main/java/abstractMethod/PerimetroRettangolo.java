package abstractMethod;

public class PerimetroRettangolo implements FiguraGeometrica{

	int lato1;
	int lato2;
	
	public PerimetroRettangolo(int lato1, int lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
	}
	
	@Override
	public void stampaFigura() {
		System.out.println("Perimetro rettangolo " + ( (lato1 * 2) + (lato2 * 2) ));
	}

}
