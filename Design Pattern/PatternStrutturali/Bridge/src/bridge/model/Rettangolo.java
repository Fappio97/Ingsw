package bridge.model;

import java.util.Arrays;
import java.util.List;

public class Rettangolo extends FiguraGeometrica{
	
	private int lato1;
	private int lato2;
	
	public Rettangolo(int lato1, int lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
		nome = "Rettangolo";
	}
	
	@Override
	public List<Integer> dimensioni() {
		return Arrays.asList(lato1, lato2);
	}
/*
	@Override
	public void stampaFigura() {
		stampaLatoPieno();
		for(int i = 1; i < lato2 - 1; ++i)
			stampaLatoVuoto();
		stampaLatoPieno();
		System.out.println();
	}
	
	private void stampaLatoPieno() {
		for(int i = 0; i < lato1; ++i) {
			System.out.print("*");
			if(i + 1 < lato1)
				System.out.print(" ");
		}
		System.out.println();
	}
	
	private void stampaLatoVuoto() {
		for(int i = 0; i < lato1; ++i) {
			if(i == 0 || i == lato1 - 1)
				System.out.print("*");
			else
				System.out.print(" ");
			if(i + 1 < lato1)
				System.out.print(" ");
		}
		System.out.println();
	}
*/

}
