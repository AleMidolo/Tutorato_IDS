package org.javaClasses.negozio;

/**
 * Interfaccia che definisce le proprietà che 
 * ogni lavoratore deve avere all'interno del negozio
 * 
 */

public interface Lavoratore {

	/**
	 * Restituisce lo stipendio del lavoratore
	 * 
	 * @return ritorna il valore dello stipendio del lavoratore
	 */
	public Double getStipendio();
	
	/**
	 * Modifica il valore dello stipendio del lavoratore
	 * 
	 * @param newStipendio il nuovo valore dello stipendio da impostare
	 */
	public void setStipendio(Double newStipendio);
	
	/**
	 * Restituisce il nome del lavoratore
	 * 
	 * @return il nome del lavoratore
	 */
	public String getNome();
	
	/**
	 * Restituisce il cognome del lavoratore
	 * 
	 * @return il cognome del lavoratore
	 */
	public String getCognome();
	
	/**
	 * Restituisce la data di nascita del lavoratore
	 * 
	 * @return la data di nascita del lavoratore
	 */
	public String getDataDiNascita();
}
