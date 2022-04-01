package org.javaClasses.negozio;

import java.util.ArrayList;

/**
 * Classe usata per gestire i manager con il ruolo di capo area
 * eredita gli attributi e i metodi della classe Manager
 * presenta una lista di addetti da gestire nella sua area
 * 
 */

public class CapoArea extends Manager {
	
	private ArrayList<AddettoVendite> addetti;
	private Area area;

	/**
	 * Costruttore per generare un nuovo capo area
	 * definisce i parametri necessari per la creazione
	 * permette di inserire l'area di competenza del capo area
	 * 
	 * @param n nome del capo area
	 * @param c cognome del capo area
	 * @param d data di nascita del capo area
	 * @param s stipendio del capo area
	 * @param area area di competenza 
	 */
	public CapoArea(String n, String c, String d, Double s, Area area) {
		super(n, c, d, s);
		this.area = area;
		addetti = new ArrayList<>();
	}

	/**
	 * Costruttore per generare un nuovo capo area
	 * passando come paramentro la lista degli addetti
	 * della sua area
	 * 
	 * @param n nome del capo area
	 * @param c cognome del capo area
	 * @param d data di nascita del capo area
	 * @param s stipendio del capo area
	 * @param area area di competenza 
	 * @param addetti lista degli addetti dell'area
	 */
	public CapoArea(String n, String c, String d, Double s, Area area, ArrayList<AddettoVendite> addetti) {
		super(n, c, d, s);
		this.area = area;
		this.addetti = addetti;
	}
	
	
	/**
	 * Ritorna la lista degli addetti all'area del capo area
	 *
	 * @return lista degli addetti
	 */
	public ArrayList<AddettoVendite> getAddetti(){
		return addetti;
	}
	
	/**
	 * Ritorna l'area di cui il manager è a capo
	 * 
	 * @return l'area
	 */
	public Area getArea() {
		return area;
	}
	
	/**
	 * Aggiunge un addetto alle vendite alla lista degli addetti
	 * Verifica se l'addetto è già presente nell'area o meno
	 * 
	 * @param a l'addetto da inserire
	 */

	public void aggiungiAddetto(AddettoVendite a) {
		if(addetti.contains(a)) {
			System.out.println("L'addetto " + a.getNome() + " " + a.getCognome() + " è già presente in quest'area");
			return;
		}
		addetti.add(a);
	}
	
	/**
	 * Rimuove un addetto dalla lista degli addetti
	 * se e solo se questo è assegnato a quest'area
	 * 
	 * @param a l'addetto da rìmuovere
	 */
	public void rimuoviAddetto(AddettoVendite a) {
		if(!addetti.remove(a)) {
			System.out.println("L'addetto " + a.getNome() + " " + a.getCognome() + " non è presente in quest'area");
		}
	}

	/**
	 * Modifica lo stipendio di un addetto dell'area
	 * se e solo se questo è assegnato all'area del manager
	 * 
	 * @param a l'addetto a cui bisogna modificare lo stipendio
	 * @param s il nuovo valore dello stipendio 
	 */
	public void modificaStipendio(AddettoVendite  a, Double s) {
		if(addetti.contains(a))
			a.setStipendio(s);
		else
			System.out.println("Il manager " + this.getNome() + " " + this.getCognome() + " non può modificare lo stipendio"
					+ " di un addetto che non appartiene alla sua area");
	}
}