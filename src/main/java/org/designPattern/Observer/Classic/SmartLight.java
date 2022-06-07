package org.designPattern.Observer.Classic;

public class SmartLight implements Observer {

	private AssistenteVocale assistente;
	private final String stanza;
	private boolean accesa;

	public SmartLight(AssistenteVocale assistente, String stanza) {
		this.assistente = assistente;
		this.stanza = stanza;
		this.accesa = false;
	}

	@Override
	public void update() {
		ComandoVocale cv = assistente.getUltimoComando();
		elaboraComando(cv);
	}

	private void elaboraComando(ComandoVocale cv) {
		String testo = cv.getTrascrizione().toLowerCase();

		if (testo.equals("accendi luci") || testo.equals("accendi luci " + stanza))
			accendi();
		else if (testo.equals("spegni luci") || testo.equals("spegni luci " + stanza))
			spegni(); 
	}

	private void accendi() {
		if (! accesa) {
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