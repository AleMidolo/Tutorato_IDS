package org.designPattern.Adapter;

import java.util.HashMap;

// RUOLO: Adapter
public class AdapterClienti implements InterfacciaClienti {

	private GestoreClienti gestore;
	
	public AdapterClienti(){
		gestore = new GestoreClienti();
	}
	
	@Override
	public boolean aggiungiCliente(String nome, String cognome) {
		if(nome.equals("") || cognome.equals("")) {
			System.out.println("E' necessario riempire entrambi i campi nome e cognome prima di inserire un cliente!");
			return false;
		}
		if(!alreadyExist(nome, cognome, gestore.getAllClients())) {
			gestore.addClient(cognome, nome);
			return true;
		}
		else {
			System.out.println("Cliente già presente nel gestore");
			return false;
		}
	}

	@Override
	public String getNomeCliente(String cognome) {
		if(gestore.getAllClients().containsKey(cognome)) {
			return gestore.getClient(cognome);
		}
		else {
			System.out.println("Il cliente richiesto non è registrato");
			return "";
		}
	}

	@Override
	public boolean rimuoviCliente(String nome, String cognome) {
		if(alreadyExist(nome, cognome, gestore.getAllClients())) {
			gestore.remove(cognome, nome);
			return true;
		}
		System.out.println("Il cliente da rimuovere non è registrato");
		return false;
	}

	public int getNumeroClienti() {
		return gestore.count();
	}
	
	public boolean alreadyExist(String nome, String cognome, HashMap<String, String> clienti) {
		return clienti.keySet().stream().
					anyMatch(k -> k.equals(cognome) && clienti.get(k).equals(nome));
	}
}
