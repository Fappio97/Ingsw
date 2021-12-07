package chainOfResponsibility;

import java.util.List;

public class StampanteBiancoNero extends Stampante {

	public StampanteBiancoNero(List<String> formati) {
		// TODO Auto-generated constructor stub
		this.occupata = false;
		this.formati = formati;
	}

	@Override
	public boolean stampa(Documento documento) {
		if(documento.isColori() || this.occupata || !formati.contains(documento.getDimensione().toLowerCase()))
			return passaAllaProssima(documento);
		occupata = true;
		return true;
	}
	
	@Override
	public String toString() {
		return "Stampante bianco e nero " + formati.toString();
	}
	
}
