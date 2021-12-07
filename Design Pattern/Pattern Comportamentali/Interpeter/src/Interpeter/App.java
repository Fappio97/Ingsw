package Interpeter;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	private String traccia;
	private Espressione espressione;
	private List<String> numeri;
	private List<Espressione> espressioniTerminali;
	private List<String> operatori;
	
	public App(String traccia) {
		this.traccia = traccia;
		numeri = new ArrayList<String>();
		operatori = new ArrayList<String>();
		espressioniTerminali = new ArrayList<Espressione>();
	}
	
	private boolean valutaEspressione(String a) {
		String[] diviso = a.split(" ");
		
		boolean valida = true;
		
		for(int i = 0; i < diviso.length; ++i) {
			if(diviso[i].equals("+") || diviso[i].equals("-") || diviso[i].equals("*") || diviso[i].equals("/") || diviso[i].equals("^"))
				operatori.add(diviso[i]);
			else if(diviso[i].matches("[0-9]+"))
				numeri.add(diviso[i]);
			else
				valida = false;
		}
		 
		if(operatori.size() != numeri.size() - 1) 
			valida = false;
		
		return valida;
	}

	public void esegui() {
		if(valutaEspressione(traccia)) {
			for(String i : numeri) 
				espressioniTerminali.add(new EspressioneTerminale(i));
			for(String i : operatori) {
				switch(i) {
				case "+":
					espressione = new EspressioneSomma(espressioniTerminali.get(0), espressioniTerminali.get(1));
					break;
				case "-":
					espressione = new EspressioneSottrai(espressioniTerminali.get(0), espressioniTerminali.get(1));
					break;
				case "*":
					espressione = new EspressioneMoltiplica(espressioniTerminali.get(0), espressioniTerminali.get(1));
					break;
				case "/":
					espressione = new EspressioneDividi(espressioniTerminali.get(0), espressioniTerminali.get(1));
					break;
				case "^":
					espressione = new EspressionePotenza(espressioniTerminali.get(0), espressioniTerminali.get(1));
					break;
				default:
					return;
				}
				espressioniTerminali.add(2, new EspressioneTerminale(espressione.interpreta().toString()));
				espressioniTerminali.remove(0);
				espressioniTerminali.remove(0);
				
			}
			System.out.println(traccia + " = " + espressioniTerminali.get(0).interpreta());
		}
		else
			System.out.println("Espressione non valida");
	}
	
}
