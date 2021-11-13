package chat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class ParoleProibite {

	private static ParoleProibite paroleProibite = null;
	private Set<String> proibite;
	
	private ParoleProibite() {
		proibite = new TreeSet<String>();
		try {
			BufferedReader input = new BufferedReader(new FileReader("src/chat/resources/proibite.txt"));
			while(input.ready()) {
				proibite.add(input.readLine());			
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ParoleProibite getParoleProibite() {
		if(paroleProibite == null)
			paroleProibite = new ParoleProibite();
		return paroleProibite;
	}

	public Set<String> getProibite() {
		return proibite;
	}
	
}
