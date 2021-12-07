package Visitor;

import java.util.List;

import Interpeter.Espressione;
import Interpeter.EspressioneDividi;
import Interpeter.EspressioneMoltiplica;
import Interpeter.EspressionePotenza;
import Interpeter.EspressioneSomma;
import Interpeter.EspressioneSottrai;
import Interpeter.EspressioneTerminale;

public class VisitorContaOperatori implements Visitor {
	
	private int operatori;
	
	public VisitorContaOperatori() {
		// TODO Auto-generated constructor stub
		operatori = 0;
	}
	
	public void esegui(List<Espressione> s) {
		for(Espressione i : s) 
			i.accept(this);
		
		System.out.println(this.toString());
		return;
	}

	@Override
	public void visitEspressioneDividi(EspressioneDividi d) {
		// TODO Auto-generated method stub
		++operatori;
	}

	@Override
	public void visitEspressioneMoltiplica(EspressioneMoltiplica m) {
		// TODO Auto-generated method stub
		++operatori;
	}

	@Override
	public void visitEspressionePotenza(EspressionePotenza p) {
		// TODO Auto-generated method stub
		++operatori;
	}

	@Override
	public void visitEspressioneSomma(EspressioneSomma s) {
		// TODO Auto-generated method stub
		++operatori;
	}

	@Override
	public void visitEspressioneSottrai(EspressioneSottrai s) {
		// TODO Auto-generated method stub
		++operatori;
	}

	@Override
	public void visitEspressioneTerminale(EspressioneTerminale t) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public String toString() {
		return "Il visitatore ha contato " + operatori + " operatori";
	}

}
