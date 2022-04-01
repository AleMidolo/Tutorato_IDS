package org.javaClasses.negozio;

/**
 * Classe astratta usata per gestire i manager del negozio
 * nelle sottoclassi verranno gestiti i singoli ruoli di 
 * ogni tipologia di manager
 * 
 */
public abstract class Manager implements Lavoratore {
	
	private String nome;
	private String cognome;
	private String dataDiNascita;
	private Double stipendio;

	/**
	 * Costruttore per generare un nuovo manager
	 * definendo i parametri essenziali per la sua creazione
	 * 
	 * @param n nome del manager
	 * @param c cognome del manager
	 * @param d data di nascita del manager
	 * @param s stipendio del manager
	 */
	public Manager(String n, String c, String d, Double s) {
		nome = n;
		cognome = c;
		dataDiNascita = d;
		setStipendio(s);
	}
	
	/**
	 * Restituisce lo stipendio del manager
	 * 
	 * @return il valore dello stipendio
	 */
	@Override
	public Double getStipendio() {
		return stipendio;
	}

	/**
	 * Imposta il valore dello stipendio
	 * verificando il valore passato come parametro
	 * 
	 * @param newStipendio il nuovo stipendio da impostare
	 */
	@Override
	public void setStipendio(Double newStipendio) {
		if(newStipendio < 1500) {
			System.out.println(newStipendio + " di stipendio è troppo basso per un manager");
			return;
		}
		stipendio = newStipendio;
	}

	/**
	 * Restituisce il nome del manager
	 * 
	 * @return la stringa contenente il nome
	 */
	@Override
	public String getNome() {
		return nome;
	}

	/**
	 * Restituisce il cognome del manager
	 * 
	 * @return la stringa contenente il cognome
	 */
	@Override
	public String getCognome() {
		return cognome;
	}

	/**
	 * Restituisce la data di nascita del manager
	 * 
	 * @return la stringa contenente la data di nascita
	 */
	@Override
	public String getDataDiNascita() {
		return dataDiNascita;
	}

}
