package templateMethod;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {

		Backtracking backtracking = new SubsetSum(new Soluzione(207, Arrays.asList(4, 12, 3, 88, 192)));
		
		if(backtracking.solve())		
			backtracking.stampaSoluzione();
		else
			System.out.println("Nessuna soluzione");
		
		backtracking = new ParoleCongiunte(new Soluzione(4, Arrays.asList("malma", "matma", "magla", "tagla", "mamma", "magma")));
		
		if(backtracking.solve())	
			backtracking.stampaSoluzione();
		else
			System.out.println("Nessuna soluzione");
		
		backtracking = new ParoleCongiunte(new Soluzione(4, Arrays.asList("alma", "elma",	"almt", "alba", "olmt")));
		
		if(backtracking.solve())		
			backtracking.stampaSoluzione();
		else
			System.out.println("Nessuna soluzione");
	}
	
}
