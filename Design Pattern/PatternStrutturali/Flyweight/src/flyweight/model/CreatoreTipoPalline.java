package flyweight.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreatoreTipoPalline {
	
	public static Map<String, TipoPallina> flyweights = new HashMap<String, TipoPallina>();
	public static List<String> colori = new ArrayList<String>();

	public static TipoPallina getPallina(String nome, Color colore) {
		if(!flyweights.containsKey(nome)) {	
			colori.add(nome);
			flyweights.put(nome, new TipoPallina(nome, colore));
		}
		return flyweights.get(nome);
	}
}
