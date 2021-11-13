package flyweight.model;

import java.awt.Color;

public class TipoPallina {
	
	private String nome;
	private Color color;
	
	public String getNome() {
		return nome;
	}
	
	public Color getColor() {
		return color;
	}
	
	public TipoPallina(String nome, Color color) {
		super();
		this.color = color;
		this.nome = nome;
	}
}
