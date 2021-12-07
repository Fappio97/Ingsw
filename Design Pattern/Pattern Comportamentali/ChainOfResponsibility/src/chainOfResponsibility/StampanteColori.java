package chainOfResponsibility;

import java.util.List;

public class StampanteColori extends Stampante {
	
	public StampanteColori(List<String> list) {
		// TODO Auto-generated constructor stub
		this.occupata = false;
		this.formati = list;
	}

	@Override
	public boolean stampa(Documento documento) {
		if(this.occupata || !formati.contains(documento.getDimensione().toLowerCase()))
			return passaAllaProssima(documento);
		occupata = true;
		return true;
	}

	@Override
	public String toString() {
		return "Stampante a colori " + formati.toString();
	}
	
}
