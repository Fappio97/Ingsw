package chainOfResponsibility;

import java.util.List;

public abstract class Stampante {
	
	private Stampante prossima;
	protected boolean occupata;
	protected List<String> formati;
	
	public Stampante prossimaStampante(Stampante prossima) {
		this.prossima = prossima;
		return prossima;
	}
	
	public abstract boolean stampa(Documento documento);
	
	protected boolean passaAllaProssima(Documento documento) {
		if(prossima == null)
			return false;
		return prossima.stampa(documento);
	}
	
	@Override
	public abstract String toString();
}
