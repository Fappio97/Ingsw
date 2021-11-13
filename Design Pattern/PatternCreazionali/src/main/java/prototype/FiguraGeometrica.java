package prototype;

public abstract class FiguraGeometrica {
	
	private Integer id;
	
	public FiguraGeometrica(FiguraGeometrica f) {
		if(f != null) {
			this.id = f.id;
		}
	}
	
	public FiguraGeometrica() {
		super();
	}

	public abstract void stampaFigura();
	
	@Override
	public abstract FiguraGeometrica clone();
	
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	 @Override
	 public boolean equals(Object object2) {
	        if (!(object2 instanceof FiguraGeometrica)) return false;
	        FiguraGeometrica shape2 = (FiguraGeometrica) object2;
	        return shape2.id == id;
	 }

}
