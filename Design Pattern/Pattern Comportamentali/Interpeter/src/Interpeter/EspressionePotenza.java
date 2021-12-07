package Interpeter;

public class EspressionePotenza implements Espressione{
	
	private Espressione e1;
	private Espressione e2;
	
	public EspressionePotenza(Espressione e1, Espressione e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public Integer interpreta() {
		int a = 1;
		for(int i = 0; i < e2.interpreta(); ++i) {
			a *= e1.interpreta();
		}
		return (int) Math.pow(e1.interpreta(), e2.interpreta()); 
	}

}
