package org.designPattern.Observer.Reactive;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class SmartLight implements Subscriber<ComandoVocale> {

	//private AssistenteVocale assistente; // riferimento al Subject tramite Subscription
		private Subscription sub;
		private final String stanza;
		private boolean accesa;

		public SmartLight(String stanza) {
			this.stanza = stanza;
			this.accesa = false;
		}

		@Override // callback chiamata da Publisher.subscribe()
		public void onSubscribe(Subscription subscription) {
			this.sub = subscription;
			System.out.println(String.format("[Luce %s] Collegata", stanza));
			sub.request(1); // disponibile a ricevere il prossimo messaggio
		}

		@Override // callback chiamata da SubmissionPublisher.submit()
		public void onNext(ComandoVocale item) { // sostituisce update()
			elaboraComando(item); // elaboro l'item ricevuto
			sub.request(1); // nuovamente disponibile a ricevere il prossimo messaggio
		}

		@Override // callback chiamata in caso di errore
		public void onError(Throwable throwable) {
			System.err.println(throwable.getMessage());
		}

		@Override // callback chiamata da SubmissionPublisher.close()
		public void onComplete() { 
			System.out.println(String.format("[Luce %s] Scollegata", stanza));
		}

		private void elaboraComando(ComandoVocale cv) {
			String testo = cv.getTrascrizione().toLowerCase();

			if (testo.equals("accendi luci") || testo.equals("accendi luci " + stanza))
				accendi();
			else if (testo.equals("spegni luci") || testo.equals("spegni luci " + stanza))
				spegni();
		}

		private void accendi() {
			if (!accesa) {
				accesa = true;
				System.out.println(String.format("[Luce %s] accesa", stanza));
			}
		}

		private void spegni() {
			if (accesa) {
				accesa = false;
				System.out.println(String.format("[Luce %s] spenta", stanza));
			}
		}
}
