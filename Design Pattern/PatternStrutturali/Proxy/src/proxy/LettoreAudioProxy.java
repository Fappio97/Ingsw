package proxy;

import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.Clip;


public class LettoreAudioProxy implements Audio {
	
	private LettoreAudio lettoreAudio;
	private Map<String, Clip> cache;
	
	public LettoreAudioProxy() {
		lettoreAudio = new LettoreAudio();
		cache = new HashMap<String, Clip>();
	}

	@Override
	public Clip carica(String nomeAudio) {
		if(!cache.containsKey(nomeAudio)) {
			Display.getDisplay().aggiungiTesto("Traccia audio non presente nella cache, caricheremo la nuova traccia audio");
			cache.put(nomeAudio, lettoreAudio.carica(nomeAudio));
		} else
			Display.getDisplay().aggiungiTesto("Traccia audio già presente nella cache");
		return cache.get(nomeAudio);
	}

}
