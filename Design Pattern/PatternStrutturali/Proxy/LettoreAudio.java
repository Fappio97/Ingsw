package proxy;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class LettoreAudio implements Audio {
	
	private Clip clip;
	
	@Override
	public Clip carica(String nomeAudio) {
		try {
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource("/proxy/resources/audio/" + nomeAudio + ".wav"));
			clip = AudioSystem.getClip();
			clip.open(audioIn);
			Display.getDisplay().aggiungiTesto("Caricamento della traccia audio: " + nomeAudio);
		} catch (Exception e) {
			clip = null;
		}
		return clip;
	}

}
