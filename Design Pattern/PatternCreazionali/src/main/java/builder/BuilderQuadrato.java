package builder;

public class BuilderQuadrato implements Builder {

	@Override
	public RappresentazioneFiguraGeometrica figura() {
		RappresentazioneFiguraGeometrica rappresentazione = new RappresentazioneFiguraGeometrica();
		rappresentazione.aggiungiElemento(new Quadrato(4));
		rappresentazione.aggiungiElemento(new PerimetroQuadrato(4));
		return rappresentazione;
	}

}
