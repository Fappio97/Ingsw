package Visitor;

import Interpeter.EspressioneDividi;
import Interpeter.EspressioneMoltiplica;
import Interpeter.EspressionePotenza;
import Interpeter.EspressioneSomma;
import Interpeter.EspressioneSottrai;
import Interpeter.EspressioneTerminale;

public interface Visitor {
	void visitEspressioneDividi(EspressioneDividi d);
	
	void visitEspressioneMoltiplica(EspressioneMoltiplica m);
	
	void visitEspressionePotenza(EspressionePotenza p);
	
	void visitEspressioneSomma(EspressioneSomma s);
	
	void visitEspressioneSottrai(EspressioneSottrai s);
	
	void visitEspressioneTerminale(EspressioneTerminale t);
	
	@Override
	String toString();

}
