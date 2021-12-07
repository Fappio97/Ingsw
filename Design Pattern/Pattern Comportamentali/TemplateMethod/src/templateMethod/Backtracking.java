package templateMethod;

public abstract class Backtracking {
	
	protected Soluzione sol;
	
	public Backtracking(Soluzione sol) {
		this.sol = sol;
	}

	public boolean solve() {
		
	    int x = 0;
	    
	    while (x < sol.spazio.size()) {
	    	
	        if (canAdd(x, sol)) {
	        	
	            add(x, sol);
	            if (isComplete(sol)) return true;
	            else if (solve()) return true;
	            remove(sol);
	            x++;
	            
	        } else
	            x++;
	    }
	    
	    return false;
	}
	
	public void stampaSoluzione() {
		System.out.print("Soluzione: ");
		for(int i = 0; i < sol.sol.size(); ++i) {
			System.out.print(sol.spazio.get(sol.sol.get(i)));
			if(i + 1 != sol.sol.size())
				System.out.print(", ");
		}
		System.out.println();
	}

	protected abstract void remove(Soluzione sol);
	
	protected abstract boolean isComplete(Soluzione sol);

	protected abstract void add(int x, Soluzione sol);

	protected abstract boolean canAdd(int x, Soluzione sol);
	
}
