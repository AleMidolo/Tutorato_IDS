package org.designPattern.Adapter;

// RUOLO: Target
public interface InterfacciaClienti {

	public boolean aggiungiCliente(String nome, String cognome);
	public String getNomeCliente(String cognome);
	public boolean rimuoviCliente(String nome, String cognome);
	public int getNumeroClienti();
}
