package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlliInvioMessaggio implements ActionListener, KeyListener{

	private Chat chat;
	
	public ControlliInvioMessaggio(Chat chat) {
		// TODO Auto-generated constructor stub
		this.chat = chat;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Publisher.getPublisher().notificaChat(chat.getNome() + ": " + chat.message.getText(), chat.getIdSubscriber());
		chat.handleMessage(chat.message);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			Publisher.getPublisher().notificaChat(chat.getNome() + ": " + chat.message.getText(), chat.getIdSubscriber());
			chat.handleMessage(chat.message);	
			e.consume();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
