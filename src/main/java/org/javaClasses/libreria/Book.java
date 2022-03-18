package org.javaClasses.libreria;


public class Book {

	private String nome;
	private String ID;
	private Double prezzo;
	private Integer disponibilit�;
	private String genere;
	
	public Book(String nome, Double prezzo, String genere){
		this.nome = nome;
		this.prezzo = prezzo;
		this.genere = genere;
		disponibilit� = 1;
		ID = generateID();
	}
	
	public Book(String nome, Double prezzo, String genere, Integer disponibilit�){
		this.nome = nome;
		this.prezzo = prezzo;
		this.genere = genere;
		this.disponibilit� = disponibilit�;
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
	
	public void setPrezzo(Double nuovoPrezzo) {
		if(nuovoPrezzo <= 0) {
			System.out.println("Non si pu� inserire un prezzo minore o uguale a 0");
			return;
		}
		prezzo = nuovoPrezzo;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public void aggiungiDisponibilit�(int disp) {
		if(disp <= 0) {
			System.out.println("Non si pu� aggiungere una disponibilit� minore o uguale a 0");
			return;
		}
		disponibilit� += disp;
	}
	
	public void sottraiDisponibilit�(int disp) {
		if(disp <= 0) {
			System.out.println("Non si pu� sottrarre una disponibilit� minore o uguale a 0");
			return;
		}
		else if(disponibilit� < disp) {
			System.out.println("Non c � disponibilit� del prodotto");
			return;
		}
		
		disponibilit� -= disp;
	}
	
	public Integer getDisponibilit�() {
		return disponibilit�;
	}
	
	public void applicaSconto(Integer percentuale) {
		if(percentuale <= 0 || percentuale >= 100) {
			System.out.println("Non � possibile effettuare lo sconto del " + percentuale + "%");
			return;
		}
	
		Double nuovoPrezzo = prezzo - (prezzo/100*percentuale);
		prezzo = nuovoPrezzo;
	}
}
