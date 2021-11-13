package flyweight.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import flyweight.model.App;

public class Pannello extends JPanel {

	private static final long serialVersionUID = 2296420364228818928L;
	private JButton creaPallina;
	private JComboBox<String> combo;
	
	public Pannello() {
		setLayout(new BorderLayout());
		creaPannelloInferiore();
	}
	
	private void creaPannelloInferiore() {
		combo = new JComboBox<String>();
		String[] lista = {"black", "blue", "cyan", "drakGray", "gray", "green", "lightGray", "magenta", "pink", "red", "white", "yellow"};
		
		for(int i = 0; i < lista.length; ++i) {
			combo.addItem(lista[i]);
		}
		
		creaPallina = new JButton("Crea pallina");
		SpinnerModel sm = new SpinnerNumberModel(0, 0, 750, 10);
		JSpinner spinner = new JSpinner(sm);
		SpinnerModel sm2 = new SpinnerNumberModel(0, 0, 690, 10);
		JSpinner spinner2 = new JSpinner(sm2);

		JPanel sotto = new JPanel();
		sotto.setLayout(new BoxLayout(sotto, BoxLayout.LINE_AXIS));
		sotto.add(spinner);
		sotto.add(spinner2);
		sotto.add(combo);
		sotto.add(creaPallina);
		creaPallina.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color colore;
				try {
				    Field field = Class.forName("java.awt.Color").getField(combo.getSelectedItem().toString());
				    colore = (Color)field.get(null);
				} catch (Exception e1) {
				    colore = null; // Not defined
				}
				App.getApp().aggiungiPallina((Integer) spinner.getValue(),(Integer) spinner2.getValue(), combo.getSelectedItem().toString(), colore);
				repaint();
			}
			
		});
		add(sotto, BorderLayout.SOUTH);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < App.getApp().getPalline().size(); ++i) {
			g.setColor(App.getApp().getPalline().get(i).getTipo().getColor());
			g.fillOval(App.getApp().getPalline().get(i).getX(), App.getApp().getPalline().get(i).getY(), 50, 50);
		}
	}

}
