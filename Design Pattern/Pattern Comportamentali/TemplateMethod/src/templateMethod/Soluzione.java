package templateMethod;

import java.util.ArrayList;
import java.util.List;

public class Soluzione {

	public Integer x;
	public List<Integer> sol;
	public List<Object> spazio;
	
	public Soluzione(Integer x) {
		super();
		this.x = x;
		this.sol = new ArrayList<Integer>();
	}
		


	public Soluzione(int x, List<Object> spazio) {
		super();
		this.x = x;
		this.sol = new ArrayList<Integer>();
		this.spazio = spazio;
	}}
