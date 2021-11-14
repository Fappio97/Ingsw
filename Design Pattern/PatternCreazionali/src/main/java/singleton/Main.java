package singleton;

public class Main {
	public static void main(String[] args) {
		/*
		impossibile da fare perché il costruttore è privato
		OggettoSingleton ogg = new OggettoSingleton();
		*/
		OggettoSingleton ogg = OggettoSingleton.getIstance();
		
		System.out.println(ogg.toString());
	}
}
