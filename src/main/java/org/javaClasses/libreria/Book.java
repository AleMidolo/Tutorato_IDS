package org.javaClasses.libreria;


public class Book {

	private String nome;
	private String ID;
	private Double prezzo;
	private Integer disponibilita;
	private String genere;
	private String autore;
	
	public Book(String nome, Double prezzo, String genere, String autore){
		this.nome = nome;
		this.prezzo = prezzo;
		this.genere = genere;
		disponibilita = 1;
		ID = generateID();
	}
	
	public Book(String nome, Double prezzo, String genere, Integer disponibilita, String autore){
		this.nome = nome;
		this.prezzo = prezzo;
		this.genere = genere;
		this.disponibilita = disponibilita;
		this.autore = autore;
		ID = generateID();
	}
	
	private String generateID() {
		String ID = "";
		if(nome.length() < 4)
			ID = nome.substring(0, nome.length());
		else
			ID = nome.substring(0, 4);
		return ID;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getPrezzo() {
		return prezzo;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public void setPrezzo(Double nuovoPrezzo) {
		if(nuovoPrezzo <= 0) {
			System.out.println("Non si puo' inserire un prezzo minore o uguale a 0");
			return;
		}
		prezzo = nuovoPrezzo;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public void aggiungiDisponibilita(int disp) {
		if(disp <= 0) {
			System.out.println("Non si puo' aggiungere una disponibilita minore o uguale a 0");
			return;
		}
		disponibilita += disp;
	}
	
	public void sottraiDisponibilita(int disp) {
		if(disp <= 0) {
			System.out.println("Non si puo' sottrarre una disponibilita minore o uguale a 0");
			return;
		}
		else if(disponibilita < disp) {
			System.out.println("Non c e' disponibilita del prodotto");
			return;
		}
		
		disponibilita -= disp;
	}
	
	public Integer getDisponibilita() {
		return disponibilita;
	}
	
	public void applicaSconto(Integer percentuale) {
		if(percentuale <= 0 || percentuale >= 100) {
			System.out.println("Non e' possibile effettuare lo sconto del " + percentuale + "%");
			return;
		}
	
		Double nuovoPrezzo = prezzo - (prezzo/100*percentuale);
		prezzo = nuovoPrezzo;
	}
	
	public void stampaLibro() {
		System.out.println("Nome : " + nome);
		System.out.println("ID : " + ID);
		System.out.println("Prezzo : " + prezzo);
		System.out.println("Disponibilita : " + disponibilita);
		System.out.println("Genere : " + genere);
		System.out.println("Autore : " + autore);
	}
}
