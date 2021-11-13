package builder;

public class Builder {
	
	public RappresentazioneFiguraGeometrica quadrato() {
		RappresentazioneFiguraGeometrica rappresentazione = new RappresentazioneFiguraGeometrica();
		rappresentazione.aggiungiElemento(new Quadrato(4));
		rappresentazione.aggiungiElemento(new PerimetroQuadrato(4));
		return rappresentazione;
	}
	
	public RappresentazioneFiguraGeometrica rettangolo() {
		RappresentazioneFiguraGeometrica rappresentazione = new RappresentazioneFiguraGeometrica();
		rappresentazione.aggiungiElemento(new Rettangolo(4, 8));
		rappresentazione.aggiungiElemento(new PerimetroRettangolo(4, 8));
		return rappresentazione;
	}
}
