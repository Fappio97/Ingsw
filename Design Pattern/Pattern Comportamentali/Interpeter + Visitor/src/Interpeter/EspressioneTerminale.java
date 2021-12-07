package Interpeter;

import Visitor.Visitor;

public class EspressioneTerminale implements Espressione {
	
	private String traccia;
	
	public EspressioneTerminale(String traccia) {
		super();
		this.traccia = traccia;
	}

	@Override
	public Integer interpreta() {
		return Integer.parseInt(traccia);
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitEspressioneTerminale(this);
	}


}
