package org.javaClasses.libreria;


public class Book {

	private String nome;
	private String ID;
	private Double prezzo;
	private Integer disponibilità;
	private String genere;
	private String autore;
	
	public Book(String nome, Double prezzo, String genere, String autore){
		this.nome = nome;
		this.prezzo = prezzo;
		this.genere = genere;
		disponibilità = 1;
		ID = generateID();
	}
	
	public Book(String nome, Double prezzo, String genere, Integer disponibilità, String autore){
		this.nome = nome;
		this.prezzo = prezzo;
		this.genere = genere;
		this.disponibilità = disponibilità;
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
			System.out.println("Non si può inserire un prezzo minore o uguale a 0");
			return;
		}
		prezzo = nuovoPrezzo;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public void aggiungiDisponibilità(int disp) {
		if(disp <= 0) {
			System.out.println("Non si può aggiungere una disponibilità minore o uguale a 0");
			return;
		}
		disponibilità += disp;
	}
	
	public void sottraiDisponibilità(int disp) {
		if(disp <= 0) {
			System.out.println("Non si può sottrarre una disponibilità minore o uguale a 0");
			return;
		}
		else if(disponibilità < disp) {
			System.out.println("Non c è disponibilità del prodotto");
			return;
		}
		
		disponibilità -= disp;
	}
	
	public Integer getDisponibilità() {
		return disponibilità;
	}
	
	public void applicaSconto(Integer percentuale) {
		if(percentuale <= 0 || percentuale >= 100) {
			System.out.println("Non è possibile effettuare lo sconto del " + percentuale + "%");
			return;
		}
	
		Double nuovoPrezzo = prezzo - (prezzo/100*percentuale);
		prezzo = nuovoPrezzo;
	}
	
	public void stampaLibro() {
		System.out.println("Nome : " + nome);
		System.out.println("ID : " + ID);
		System.out.println("Prezzo : " + prezzo);
		System.out.println("Disponibilità : " + disponibilità);
		System.out.println("Genere : " + genere);
		System.out.println("Autore : " + autore);
	}
}
