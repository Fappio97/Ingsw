package templateMethod;

public class ParoleCongiunte extends Backtracking {

	public ParoleCongiunte(Soluzione sol) {
		super(sol);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void remove(Soluzione sol) {
		sol.sol.remove(sol.sol.size() - 1);
	}

	@Override
	protected boolean isComplete(Soluzione sol) {
		return sol.sol.size() == sol.x;
	}

	@Override
	protected void add(int x, Soluzione sol) {
		sol.sol.add(x);
	}

	@Override
	protected boolean canAdd(int x, Soluzione sol) {
		// se sol è vuota, io posso aggiungere in ogni caso
	    if (sol.sol.isEmpty())
	        return true;
	    
	    // se x è già dentro sol, allora non ha senso andare a controllare se è congiunta
	    for(int i = 0; i < sol.sol.size(); ++i)
	    	if(sol.sol.get(i) == x)
	    		return false;

	    // posso aggiungere x se è congiunta con tutte le parole in sol             <-- devo controllare tutte le parole
	    // => non posso aggiungere x se non è congiunta con almeno una parola sola  <-- basta fermarsi alla prima parola non congiunta
	    for (var i: sol.sol)
	        if (!congiunte((String) sol.spazio.get(i),(String) sol.spazio.get(x)))
	            return false;

	    // se sono arrivato qui significa che x è una parola non dentro sol ed è congiunta con tutte le parole dentro sol
	    return true;
	}
	
	boolean congiunte(String a, String b) {
	    return diff(a, b) <= 1; // Hamming distance
	}
	
	// ritorna il numero di posizioni in cui le due stringhe differiscono
	// è equivalente a calcolare la Hamming distance tra le due stringhe
	/*
	    mamma
	    magmma
	*/
	int diff(String a, String b) {
	    int n = a.length(), m = b.length();

	    // se la differenza delle lunghezze è almeno 2, allora so che non saranno mai congiunte, e quindi ritorno 2
	    if (Math.abs(n - m) >= 2)
	        return 2;

	    int d = 0;
	    for (int i = 0; i < a.length() && i < Math.min(n, m); ++i)    // scegliamo min(n,m) per poter accedere agli indici validi di a e b
	        if (a.charAt(i) != b.charAt(i))
	            d++;

	    if (d == 0)
	        return Math.abs(n - m);

	    return d + Math.abs(n - m);
	}

}
