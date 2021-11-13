package chat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class ParolePersonalizzate {

	private static ParolePersonalizzate parolePersonalizzate = null;
	private Set<String> personalizzate;
	
	private ParolePersonalizzate() {
		personalizzate = new TreeSet<String>();
		try {
			BufferedReader input = new BufferedReader(new FileReader("src/chat/resources/personalizzato.txt"));
			while(input.ready()) {
				personalizzate.add(input.readLine());			
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ParolePersonalizzate getParolePersonalizzate() {
		if(parolePersonalizzate == null)
			parolePersonalizzate = new ParolePersonalizzate();
		return parolePersonalizzate;
	}

	public Set<String> getPersonalizzate() {
		return personalizzate;
	}
	
}
