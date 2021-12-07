package chainOfResponsibility;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import chainOfResponsibility.view.PannelloDocumento;
import chainOfResponsibility.view.PannelloStampante;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Chain of Responsibility");
		
		PannelloDocumento sx = new PannelloDocumento();
		PannelloStampante dx = new PannelloStampante(sx);
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sx, dx);
		splitPane.setDividerSize(1);
		splitPane.setDividerLocation(200);
		f.add(splitPane);

		f.setSize(800, 800);
		f.setMinimumSize(new Dimension(400, 400));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
