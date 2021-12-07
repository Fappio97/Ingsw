package Interpeter;

import Visitor.Visitor;

public class EspressioneDividi implements Espressione{
	
	private Espressione e1;
	private Espressione e2;
	
	public EspressioneDividi(Espressione e1, Espressione e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public Integer interpreta() {
		return e1.interpreta() / e2.interpreta(); 
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitEspressioneDividi(this);
	}
	
}
