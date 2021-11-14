package adapter;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Target target = new Target("Casa");
		System.out.println(target.stampa());
		
		Adaptee adaptee = new Adaptee(Arrays.asList(67, 97, 115, 97));
		
		target = new Adapter(adaptee);
		System.out.println(target.stampa());
	}
}
