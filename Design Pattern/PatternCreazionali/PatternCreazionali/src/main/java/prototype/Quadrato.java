package prototype;

public class Quadrato extends FiguraGeometrica {
	
	private int lato;
	
	public Quadrato() {
		lato = 2;
	}
	
	public Quadrato(int lato) {
		this.lato = lato;
	}

	public Quadrato(Quadrato quadrato) {
		lato = quadrato.lato;
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

	@Override
	public void stampaFigura() {
		stampaLatoPieno();
		for(int i = 1; i < lato - 1; ++i)
			stampaLatoVuoto();
		stampaLatoPieno();
		System.out.println();
	}

	@Override
	public FiguraGeometrica clone() {
		return new Quadrato(this);
	}
	
	@Override
	public boolean equals(Object object2) {
	     if (!(object2 instanceof Quadrato) || !super.equals(object2)) return false;
	        Quadrato shape2 = (Quadrato) object2;
	     return shape2.lato == lato;
	}

}
