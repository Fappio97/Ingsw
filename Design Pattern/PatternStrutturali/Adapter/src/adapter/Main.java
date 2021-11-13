package adapter;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee(Arrays.asList(67, 97, 115, 97));
		
		Target target = new Adapter(adaptee);
		System.out.println(target.stampa());
	}
}
