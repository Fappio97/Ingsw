package mediator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class ListaDati {

	private static ListaDati listaDati = null;
	private List<String> regioni;
	private Map<String, List<String>> province;
	
	public List<String> getRegioni() {
		return regioni;
	}

	public List<String> getProvincePerRegione(String regione) {
		return province.get(regione);
	}

	private ListaDati() {
		regioni = new ArrayList<String>();
		province = new HashMap<String, List<String>>();
		
		List<String> input = new ArrayList<String>();
		// prende la lista dei file
		try {
			BufferedReader leggi = new BufferedReader(new FileReader("src/mediator/resources/listacomuni.txt"));
			
			List<String> pro = new ArrayList<String>();

			while(leggi.ready()) {
				
				String[] diviso = leggi.readLine().split(" ");

				if(!regioni.contains(diviso[5])) {
					if(!regioni.isEmpty()) {
						province.put(regioni.get(regioni.size() - 1), new ArrayList<String>(pro));
						pro.clear();
					}
					regioni.add(diviso[5]);
				}
				
				pro.add(diviso[1]);
				
			}
			province.put(regioni.get(regioni.size() - 1), new ArrayList<String>(pro));
			leggi.close();
				
			
			// effettua un sor per averle ordinate
			Collections.sort(regioni, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.toString().compareTo(o2.toString());
				}
			});
			
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static ListaDati getListaDati() {
		if(listaDati == null)
			listaDati = new ListaDati();
		return listaDati;
	}
	
	
	
}
