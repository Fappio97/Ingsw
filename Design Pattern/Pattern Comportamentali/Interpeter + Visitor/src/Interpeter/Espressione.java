package Interpeter;

import Visitor.Visitor;

public interface Espressione {
	public Integer interpreta();
	
	public void accept(Visitor visitor);
}
