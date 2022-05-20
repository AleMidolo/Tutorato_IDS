package org.designPattern.State;

public class Client {
	public static void main(String[] args) {
		Cassa cassa = new Cassa();
		cassa.emettiScontrino(10);
		cassa.emettiScontrino(5);
		cassa.ricarica();
		cassa.ripara();
		cassa.ricarica();
		cassa.emettiScontrino(5);
		cassa.ripara();
	}
}
