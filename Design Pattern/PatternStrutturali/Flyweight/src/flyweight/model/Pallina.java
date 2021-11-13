package flyweight.model;

public class Pallina {
	private int x;
	private int y;
	private TipoPallina tipo;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public TipoPallina getTipo() {
		return tipo;
	}

	public Pallina(int x, int y, TipoPallina tipo) {
		super();
		this.x = x;
		this.y = y;
		this.tipo = tipo;
	}
	}
