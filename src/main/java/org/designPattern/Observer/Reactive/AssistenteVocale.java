package org.designPattern.Observer.Reactive;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;

public class AssistenteVocale {
	private SubmissionPublisher<ComandoVocale> publ = new SubmissionPublisher<>();
	List<ComandoVocale> storicoComandi = new ArrayList<>(); // stato da monitorare
	
	public void attach(Subscriber<ComandoVocale> s) { // attach() mantenuto
		publ.subscribe(s);  // sostituisce attach()
	}

	// cambia lo stato, quindi notifica gli Observer
	public void registra(ComandoVocale cv) { // setState()
		System.out.println("[Comando] " + cv.getTrascrizione());
		storicoComandi.add(cv);
		
		publ.submit(cv); // sostituisce notify()
	}

	public void close() {
		publ.close();
	}
}