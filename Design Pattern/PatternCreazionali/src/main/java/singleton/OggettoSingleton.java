package singleton;

public class OggettoSingleton {
	
	private static OggettoSingleton oggettoSingleton;
	private String stringa;

	private OggettoSingleton() {
		stringa = "Hello World";
	}
	
	public String toString() {
		return stringa;
	}
	
	public static OggettoSingleton getIstance() {
		if(oggettoSingleton == null)
			oggettoSingleton = new OggettoSingleton();
		return oggettoSingleton;
	}
	
}