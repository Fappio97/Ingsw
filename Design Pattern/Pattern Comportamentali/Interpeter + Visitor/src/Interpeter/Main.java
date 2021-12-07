package Interpeter;

import Visitor.VisitorContaOperatori;

public class Main {
	public static void main(String[] args) {
		
		String espressione = "2 + 3 * 6 / 2 - 14";
		
		App a = new App(espressione);
		a.esegui();
		
		
		VisitorContaOperatori c = new VisitorContaOperatori();
		c.esegui(a.getEspressioni());
	}


}
