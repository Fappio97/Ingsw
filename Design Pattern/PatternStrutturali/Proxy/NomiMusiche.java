package proxy;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NomiMusiche {
	
	private static NomiMusiche nomiMusiche = null;
	private List<String> lista;
	
	private NomiMusiche() {
		lista = new ArrayList<String>();
		File file = new File(getClass().getResource("/proxy/resources/audio").getPath());
		
		// prende la lista dei file
		for(var i : file.listFiles()) {
			String stringa = i.toString();
			
			// in questo modo, su qualsiasi pc, dovrebbe prenderlo perché prende dall'ultimo '/' in poi
			String[] diviso = stringa.split("/");
			stringa = diviso[diviso.length - 1];
			
			// per prendere il punto che divide il nome dal formato dell'audio
			diviso = stringa.split("\\.");
			lista.add(diviso[0]);
		}
		
		// effettua un sor per averle ordinate
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
	}
	
	public static NomiMusiche getNomiMusiche() {
		if(nomiMusiche == null)
			nomiMusiche = new NomiMusiche();
		return nomiMusiche;
	}

	public List<String> getLista() {
		return lista;
	}
	
	
}
