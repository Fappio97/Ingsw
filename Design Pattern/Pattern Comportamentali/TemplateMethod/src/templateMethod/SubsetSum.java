package templateMethod;

public class SubsetSum extends Backtracking {
	
	public SubsetSum(Soluzione sol) {
		super(sol);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void remove(Soluzione sol) {
		sol.sol.remove(sol.sol.size() - 1);
	}

	@Override
	protected boolean isComplete(Soluzione sol) {
		int s = 0;
		for(int i = 0; i < sol.sol.size(); ++i)
			s += (Integer) sol.spazio.get(sol.sol.get(i));
		
		return s == sol.x;
	}

	@Override
	protected void add(int x, Soluzione sol) {
		sol.sol.add(x);
	}

	@Override
	protected boolean canAdd(int x, Soluzione sol) {
		for(int i = 0; i < sol.sol.size(); ++i)
			if(i == x)
				return false;

		int s = 0;
		for(int i = 0; i < sol.sol.size(); ++i)
			s += (Integer)  sol.spazio.get(i);
		return s + (Integer) sol.spazio.get(x) <= sol.x;
	}

	/*
	@Override
	public void stampaSoluzione() {
		System.out.print("Subset sum: ");
		for(int i = 0; i < sol.sol.size(); ++i) {
			System.out.print(sol.spazio.get(sol.sol.get(i)));
			if(i + 1 != sol.sol.size())
				System.out.print(", ");
		}
		System.out.println();
	}*/
	
}
