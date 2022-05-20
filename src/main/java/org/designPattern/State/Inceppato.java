package org.designPattern.State;

//RUOLO: ConcreteState
public class Inceppato implements Stato {

	@Override
	public Stato esegui(int p) {
		System.out.println("La cassa è inceppata, non è possibile emettere lo scontrino di prezzo " + p + "\n Riparare la cassa");
		return this;
	}

	@Override
	public Stato ricarica() {
		System.out.println("La cassa è inceppata, riparare la cassa!");
		return this;
	}

	@Override
	public Stato ripara() {
		System.out.println("Cassa riparata!");
		return new Scarico();
	}

}
