package org.designPattern.State;

//RUOLO: ConcreteState
public class Scarico implements Stato {

	@Override
	public Stato esegui(int p) {
		System.out.println("Non è possibile stampare uno scontrino di prezzo " + p + "\nCassa inceppata");
		return new Inceppato();
	}

	@Override
	public Stato ricarica() {
		System.out.println("Carta ricaricata!\nOra è possibile stampare scontrini");
		return new Carico();
	}

	@Override
	public Stato ripara() {
		System.out.println("La cassa funziona perfettamente");
		return this;
	}

}
