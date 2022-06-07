package org.designPattern.Observer.Reactive;

public class ComandoVocale {
	private final String trascrizione;
	
	public ComandoVocale(String trascrizione) {
		this.trascrizione = trascrizione;
	}
	
	public String getTrascrizione() {
		return trascrizione;
	}
}
