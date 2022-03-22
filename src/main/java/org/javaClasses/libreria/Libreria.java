package org.javaClasses.libreria;

import java.util.ArrayList;

public class Libreria {

	ArrayList<Scaffale> scaffali;
	
	public Libreria(){
		scaffali = new ArrayList<>();
	}
	
	public Libreria(ArrayList<Scaffale> scaffali){
		if(scaffali.size() > 10) {
			System.out.println("La lista di scaffali passati è troppo grande, inizializzo una lista vuota");
			this.scaffali = new ArrayList<>();
		}
		else
			this.scaffali = scaffali;
	}
	
	public ArrayList<Scaffale> getScaffali(){
		return scaffali;
	}
	
	public void addScaffale(Scaffale scaffale) {
		if(scaffali.size() < 10)
			scaffali.add(scaffale);
		else
			System.out.println("Libreria piena");
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
}
