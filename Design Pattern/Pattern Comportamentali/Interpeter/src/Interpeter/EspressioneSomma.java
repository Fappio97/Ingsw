package Interpeter;

public class EspressioneSomma implements Espressione {
	
	private Espressione e1;
	private Espressione e2;
	
	public EspressioneSomma(Espressione e1, Espressione e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public Integer interpreta() {
		return e1.interpreta() + e2.interpreta(); 
	}

}
