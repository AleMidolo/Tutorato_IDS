package org.javaClasses.libreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

	private ArrayList<Scaffale> scaffali;
	
	public Libreria(){
		scaffali = new ArrayList<>();
	}
	
	public Libreria(ArrayList<Scaffale> scaffali){
		if(scaffali.size() > 10) {
			System.out.println("La lista di scaffali passati è troppo grande, inizializzo una lista vuota");
			this.scaffali = new ArrayList<>();
		}
		else {
			for(Scaffale s : scaffali) {
				addScaffale(s);
			}
		}
	}
	
	public ArrayList<Scaffale> getScaffali(){
		return scaffali;
	}
	
	public void addScaffale(Scaffale scaffale) {
		for(Scaffale s : scaffali) {
			if(s.getGenere().equals(scaffale.getGenere())) {
				System.out.println("Lo scaffale di questo genere è già presente");
			}
		}
		if(scaffali.size() < 10)
			scaffali.add(scaffale);
		else
			System.out.println("Libreria piena");
	}
	
	public void addLibro(Book libro) {
		for(Scaffale s : scaffali) {
			if(libro.getGenere().equals(s.getGenere())) {
				s.addLibro(libro);
				return;
			}
		}
		Scaffale nuovoScaffale = new Scaffale(libro.getGenere());
		nuovoScaffale.addLibro(libro);
		addScaffale(nuovoScaffale);
	}
	
	public void rimuoviScaffale(String genere) {
		for(Scaffale scaffale : scaffali) {
			if(scaffale.getGenere().equals(genere)) {
				scaffale.rimuoviTutto();
				scaffali.remove(scaffale);
				return;
			}
		}
		System.out.println("Lo scaffale " + genere + " non è presente nella libreria");
	}
	
	public List<Book> getLibri() {
		List<Book> libri = new ArrayList<>();
		scaffali.forEach(scaffale -> libri.addAll(scaffale.getLibri()));
		return libri;
	}
}
