package prototype;

public class Rettangolo extends FiguraGeometrica{
	
	int lato1 = 2;
	private int lato2 = 4;
	
	public Rettangolo(int lato1, int lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
	}

	public Rettangolo() {
	}

	public Rettangolo(Rettangolo rettangolo) {
		super(rettangolo);
		if(rettangolo != null) {
			lato1 = rettangolo.lato1;
			lato2 = rettangolo.lato2;
		}
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

	@Override
	public void stampaFigura() {
		stampaLatoPieno();
		for(int i = 1; i < lato2 - 1; ++i)
			stampaLatoVuoto();
		stampaLatoPieno();
		System.out.println();
	}

	@Override
	public FiguraGeometrica clone() {
		return new Rettangolo(this);
	}
	
	@Override
	public boolean equals(Object object2) {
	     if (!(object2 instanceof Rettangolo) || !super.equals(object2)) return false;
	        Rettangolo shape2 = (Rettangolo) object2;
	     return shape2.lato1 == lato1 && shape2.lato2 == lato2;
	}
}
