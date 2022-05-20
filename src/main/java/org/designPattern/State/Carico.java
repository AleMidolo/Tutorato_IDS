package org.designPattern.State;

// RUOLO: ConcreteState
public class Carico implements Stato {

	@Override
	public Stato esegui(int s) {
		System.out.println("Emesso scontrino di prezzo: " + s);
		return new Scarico();
	}

	@Override
	public Stato ricarica() {
		System.out.println("La carta è già caricata");
		return this;
	}

	@Override
	public Stato ripara() {
		System.out.println("La cassa funziona perfettamente");
		return this;
	}
}