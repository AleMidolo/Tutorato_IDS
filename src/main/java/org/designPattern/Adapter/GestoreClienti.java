package org.designPattern.Adapter;

import java.util.HashMap;

// RUOLO: Adaptee
public class GestoreClienti {

	private HashMap<String, String> clienti;
	
	GestoreClienti(){
		clienti = new HashMap<>();
	}
	
	public void addClient(String m, String n) {
		clienti.put(m, n);
	}
	
	public String getClient(String m) {
		return clienti.get(m);
	}
	
	public HashMap<String, String> getAllClients(){
		return clienti;
	}
	
	public void remove(String m, String n) {
		clienti.remove(m, n);
	}
	
	public int count() {
		return clienti.keySet().size();
	}
}
