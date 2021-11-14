package builder;

public class BuilderRettangolo implements Builder {

	@Override
	public RappresentazioneFiguraGeometrica figura() {
		RappresentazioneFiguraGeometrica rappresentazione = new RappresentazioneFiguraGeometrica();
		rappresentazione.aggiungiElemento(new Rettangolo(4, 8));
		rappresentazione.aggiungiElemento(new PerimetroRettangolo(4, 8));
		return rappresentazione;
	}

}
