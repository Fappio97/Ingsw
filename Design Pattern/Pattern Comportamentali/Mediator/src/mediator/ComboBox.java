package mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JComboBox;

public class ComboBox extends JComboBox<String> implements Component {

	private static final long serialVersionUID = 2650284951941227503L;
	private Mediator mediator;
	public String nome;
	
	public void aggiungiDati(List<String> dati) {
		this.removeAllItems();
		for(int i = 0; i < dati.size(); ++i) 
			this.addItem(dati.get(i));
//		this.setSelectedItem(null);
	}
	
	public ComboBox(Mediator mediator) {
		setMediator(mediator);
		this.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            	if(e.getStateChange() == ItemEvent.SELECTED)
            		if(getElemento() != null)
            			mediator.stampa(nome + ": " + getElemento() + "\n");
            }
        });

	}

	public Object getElemento() {
		return this.getSelectedItem();
	}
	
	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

}
