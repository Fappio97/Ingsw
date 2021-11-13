package builder;

public class Main {
	public static void main(String[] args) {
		Builder builder = new Builder();
		RappresentazioneFiguraGeometrica r = builder.quadrato();
		r.stampaElementi();
		
		System.out.println();
		
		r = builder.rettangolo();
		r.stampaElementi();
	}
}
