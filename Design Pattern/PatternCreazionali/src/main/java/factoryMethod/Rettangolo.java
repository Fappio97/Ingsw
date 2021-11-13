package factoryMethod;

public class Rettangolo implements FiguraGeometrica{
	
	private int lato1 = 0;
	private int lato2 = 0;
	
	public Rettangolo() {
		lato1 = 0;
		lato2 = 0;
	}
	
	public Rettangolo(int lato1, int lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
	}

	@Override
	public void stampaFigura() {
		stampaLatoPieno();
		for(int i = 1; i < lato2 - 1; ++i)
			stampaLatoVuoto();
		stampaLatoPieno();
		System.out.println();
	}
	
	private void stampaLatoPieno() {
		for(int i = 0; i < lato1; ++i) {
			System.out.print("*");
			if(i + 1 < lato1)
				System.out.print(" ");
		}
		System.out.println();
	}
	
	private void stampaLatoVuoto() {
		for(int i = 0; i < lato1; ++i) {
			if(i == 0 || i == lato1 - 1)
				System.out.print("*");
			else
				System.out.print(" ");
			if(i + 1 < lato1)
				System.out.print(" ");
		}
		System.out.println();
	}
}
