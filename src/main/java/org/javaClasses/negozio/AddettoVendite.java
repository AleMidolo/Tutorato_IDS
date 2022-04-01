package org.javaClasses.negozio;

/**
 * Classe che gestisce il ruolo di Addetto alle Vendite
 * Un addetto alle vendite presenterà un nome, cognome,
 * data di nascita e lo stipendio  
 * 
 */

public class AddettoVendite implements Lavoratore {
	
	private String nome;
	private String cognome;
	private String dataDiNascita;
	private Double stipendio;
	
	/**
	 * Costruttore per generare un nuovo Addetto alle Vendite
	 * definendo i parametri necessari per la creazione
	 * 
	 * @param n è la stringa del nome
	 * @param c è la stringa del cognome
	 * @param d è la string della data di nascita
	 * @param s è il valore dello stipendio
	 */
	public AddettoVendite(String n, String c, String d, Double s) {
		nome = n;
		cognome = c;
		dataDiNascita = d;
		setStipendio(s);
	}

	/**
	 * Restituisce lo stipendio dell'addetto
	 * 
	 * @return il valore dello stipendio
	 */
	@Override
	public Double getStipendio() {
		return stipendio;
	}

	/**
	 * Permette la modifica dello stipendio
	 * effettuando un controllo sul valore inserito
	 * 
	 * @param newStipendio il valore dello stipendio che si vuole inserire
	 */
	@Override
	public void setStipendio(Double newStipendio) {
		if(newStipendio <= 0 || newStipendio >= 1500) {
			System.out.println("Non è possibile inserire " + newStipendio + " di stipendio per questo ruolo");
			return;
		}
		stipendio = newStipendio;
	}

	/**
	 * Restituisce il nome dell'addetto
	 * non è possibile impostare il nome
	 * se non tramite il costruttore
	 * 
	 * @return la stringa contenente il nome
	 */
	@Override
	public String getNome() {
		return nome;
	}
	
	/**
	 * Restituisce il cognome dell'addetto
	 * non è possibile impostare il cognome
	 * se non tramite il costruttore
	 * 
	 * @return la stringa contenente il cognome
	 */
	@Override
	public String getCognome() {
		return cognome;
	}

	/**
	 * Restituisce la data di nascita dell'addetto
	 * non è possibile impostarla
	 * se non tramite il costruttore
	 * 
	 * @return la stringa contenente la data di nascita
	 */
	@Override
	public String getDataDiNascita() {
		return dataDiNascita;
	}

}
