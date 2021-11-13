package proxy;

import javax.swing.JTextArea;

public class Display extends JTextArea {

	private static final long serialVersionUID = -7848740821429862067L;
	private static Display display = null;
	
	private Display() {
		this.setEditable(false);
		this.setText("Avvio lettore audio");
	}
	
	public void aggiungiTesto(String testo) {
		this.append("\n" + testo);
	}

	public static Display getDisplay() {
		if(display == null)
			display = new Display();
		return display;
	}

}
