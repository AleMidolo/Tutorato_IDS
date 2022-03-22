package org.javaClasses.libreria;

import java.util.ArrayList;
import java.util.Comparator;

public class Scaffale {

	private ArrayList<Book> libri;
	private String genere;
	
	public Scaffale(String genere){
		this.genere = genere;
		libri = new ArrayList<>();
	}
	
	public Scaffale(String genere, ArrayList<Book> libri){
		
		for(Book libro : libri) {
			addLibro(libro);
		}
		libri.sort(Comparator.comparing(Book::getNome));
		this.genere = genere;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public ArrayList<Book> getLibri(){
		return libri;
	}
	
	public void addLibro(Book libro) {
		if(libri.size() < 10) {
			if(libro.getGenere().equals(genere)) {
				if(!verificaLibro(libro)) {
					libri.add(libro);
					libri.sort(Comparator.comparing(Book::getNome));
				}
				else
					System.out.println("Il libro è già presente nello scaffale");
			}
			else
				System.out.println("Il libro inserito non è dello stesso genere dello scaffale");
		}
		else
			System.out.println("Scaffale pieno");
	}
	
	public void rimuoviLibro(String libro) {
		for(Book l : libri) {
			if(l.getNome().equals(libro)) {
				libri.remove(l);
				return;
			}
		}
		System.out.println("Il libro " + libro + " non è presente nello scaffale");
	}
	
	public void rimuoviTutto() {
		libri.clear();
	}
	
	public void applicaSconto(int sconto) {
		for(Book libro : libri) {
			libro.applicaSconto(sconto);
		}
	}
	
	public boolean verificaLibro(Book libro) {
		boolean presente = false;
		for(Book l : libri) {
			if(l.getNome().equals(libro.getNome()))
				presente = true;
		}
		return presente;
	}
}
