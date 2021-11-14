package builder;

public class Main {
	public static void main(String[] args) {
		Builder builder = new BuilderQuadrato();
		RappresentazioneFiguraGeometrica r = builder.figura();
		r.stampaElementi();
		
		System.out.println();
		
		builder = new BuilderRettangolo();
		r = builder.figura();
		r.stampaElementi();
	}
}
