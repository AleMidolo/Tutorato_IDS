package org.designPattern.Facade;

// RUOLO: Facade
public class BattleRoyale {

		// Componenti del sottosistema
		private AntiCheat ac = new AntiCheat();
		private Server s = new Server(150);
		private Autenticator auth = new Autenticator();
		
		public void registra(Giocatore g) {
			auth.registraGiocatore(g);
		}
		
		public void partecipa(Giocatore g) {
			
			if (!auth.isRegistrato(g)) {
				System.out.println("Utente non registrato");
				return;
			}

			if (ac.isCheater(g)) {
				System.out.println("L'equip scelto non è consentito");
				return;
			}

			if (s.isPieno()) {
				System.out.println("Server pieno");
				return;
			}

			s.addGiocatore(g);
			System.out.println("Il giocatore è entrato in partita");
		}
		
		public void stato() {
			System.out.println(s);
		}
}
