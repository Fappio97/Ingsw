package prototype;


import java.util.HashMap;
import java.util.Map;

public class Prototype {
	private static Map<Integer, FiguraGeometrica> FiguraGeometricaMap  = new HashMap<Integer, FiguraGeometrica>();

	public static FiguraGeometrica getFigura(Integer figuraID) {
		FiguraGeometrica figuraGeometrica = FiguraGeometricaMap.get(figuraID);
		return (FiguraGeometrica) figuraGeometrica.clone();
	}

	public static void caricaFigure() {
		   
		Quadrato quadrato = new Quadrato();
		quadrato.setId(1);
		FiguraGeometricaMap.put(quadrato.getId(), quadrato);

		Rettangolo rettangolo = new Rettangolo();
		rettangolo.setId(2);
		FiguraGeometricaMap.put(rettangolo.getId(), rettangolo);
	}
}
