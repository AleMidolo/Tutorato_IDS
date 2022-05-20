package org.designPattern.State.EsempioSenzaState;

public class Cassa {

	public enum Stato {CARICO, SCARICO, INCEPPATO}
	
	public Stato stato;
	
	public Cassa() {
		stato = Stato.CARICO;
	}
	
	public void emettiScontrino(int prezzo) {
		switch(stato) {
			case CARICO:
				System.out.println("Emesso scontrino di prezzo: " + prezzo);
				stato = Stato.SCARICO;
				break;
			case SCARICO:
				System.out.println("Non è possibile stampare uno scontrino di prezzo " + prezzo + "\nCassa inceppata");
				stato = Stato.INCEPPATO;
				break;
			case INCEPPATO:
				System.out.println("La cassa è inceppata, non è possibile emettere lo scontrino di prezzo " + prezzo + "\n Riparare la cassa");
				break;
			default:
				break;
		}
	}
	
	public void ricarica() {
		switch(stato) {
			case CARICO:
				System.out.println("La carta è già caricata");
				break;
			case SCARICO:
				System.out.println("Carta ricaricata!\nOra è possibile stampare scontrini");
				stato = Stato.CARICO;
				break;
			case INCEPPATO:
				System.out.println("La cassa è inceppata, riparare la cassa!");
				break;
			default:
				break;
		}
	}
	
	public void ripara() {
		switch(stato) {
			case CARICO:
				System.out.println("La cassa funziona perfettamente");
				break;
			case SCARICO:
				System.out.println("La cassa funziona perfettamente");
				break;
			case INCEPPATO:
				System.out.println("Cassa riparata!");
				stato = Stato.SCARICO;
			default:
				break;
		}
	}
}
