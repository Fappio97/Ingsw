package Interpeter;

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


}
