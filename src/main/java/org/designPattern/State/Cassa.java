package org.designPattern.State;

// RUOLO: Context
public class Cassa {

	private Stato stato;

	public Cassa() {
		stato = new Carico();
	}

	public void emettiScontrino(int prezzo) {
		stato = stato.esegui(prezzo);
	}

	public void ricarica() {
		stato = stato.ricarica();
	}

	public void ripara() {
		stato = stato.ripara();
	}
}