package builder;

public class Quadrato implements FiguraGeometrica {
	
	private int lato;
	
	public Quadrato() {
		lato = 0;
	}
	
	public Quadrato(int lato) {
		this.lato = lato;
	}

	@Override
	public void stampaFigura() {
		stampaLatoPieno();
		for(int i = 1; i < lato - 1; ++i)
			stampaLatoVuoto();
		stampaLatoPieno();
		System.out.println();
	}
	
	private void stampaLatoPieno() {
		for(int i = 0; i < lato; ++i) {
			System.out.print("*");
			if(i + 1 < lato)
				System.out.print(" ");
		}
		System.out.println();
	}
	
	private void stampaLatoVuoto() {
		for(int i = 0; i < lato; ++i) {
			if(i == 0 || i == lato - 1)
				System.out.print("*");
			else
				System.out.print(" ");
			if(i + 1 < lato)
				System.out.print(" ");
		}
		System.out.println();
	}

}
