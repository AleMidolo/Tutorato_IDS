package org.designPattern.Facade;

public class Client {

	public static void main(String[] args) {
		
		BattleRoyale br = new BattleRoyale();
		br.stato();
		
		// creo un giocatore non registrato e con un'arma non consentita
		Giocatore g = new Giocatore(1234);
		g.setEquip("Spara-Galline");
		
		// utente non registrato, non permette l'accesso
		br.partecipa(g);
	
		// registro l'utente
		br.registra(g);
		
		// arma non consentita, non permette l'accesso
		br.partecipa(g);
		
		br.stato();

		// cambio arma
		g.setEquip("fucile");
		
		// accesso consentito
		br.partecipa(g);

		// controllo lo stato del server
		br.stato();
	}
}
