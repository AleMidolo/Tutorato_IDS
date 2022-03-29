package org.javaClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.javaClasses.libreria.Book;

/* 
 * Potete trovare la documentazione relative alla classe List e ArrayList di java nei seguenti links
 * https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 */

public class EsempiList {
	
	public static void main(String[] args) {
		
		ArrayList<String> books = new ArrayList<>();
		
		// inserimento di un elemento all'interno della lista
		books.add("Il signore degli anelli");
		books.add("Guerra e pace");
		books.add("La Divina Commedia");
		books.add("Il Piccolo Principe");
		books.add("Harry Potter");
		books.add(2, "Geronimo Stilton");
		
		System.out.println(books);
		
		// l'accesso a un elemento della lista 
		System.out.println("Il terzo libro della lista è: " + books.get(2) + "\n");
		
		// la modifica di un elemento della lista
		books.set(2, "Il Decamerone");
		System.out.println("Nuova lista: " + books + "\n");
		
		// rimozione di un elemento
		books.remove(2);
		System.out.println("Rimosso il terzo elemento della lista: " + books + "\n");
		
		// numero di elementi presenti nella lista
		System.out.println("Numero di elementi: " + books.size() + "\n");
		
		// per ciclare su una list ci sono due modi
		
		// 1: ciclo for primitivo
		System.out.println("Lista dei libri con ciclo for primitivo: ");
		for(int i=0; i<books.size(); i++) {
			System.out.println("\t" + books.get(i));
		}
		System.out.println("\n");
		
		// 2: ciclo for avanzato
		System.out.println("Lista dei libri con ciclo for avanzato: ");
		for(String book : books) {
			System.out.println("\t" + book);
		}
		System.out.println("\n");

		// ordinare una lista
		Collections.sort(books);
		System.out.println("Lista ordinata crescente: \n\t" + books);
		Collections.sort(books, Collections.reverseOrder());
		System.out.println("Lista ordinata decrescente: \n\t" + books + "\n");
		
		// rimuovere tutti gli elementi della lista
		books.clear();
		
		
		ArrayList<Book> libri = new ArrayList<>();
		libri.add(new Book("Il Signore degli Anelli", 14.5, "Fantasy", "J.R.R. Tolkien"));
		libri.add(new Book("La Divina Commedia", 10.5, "Letteratura", 5, "D. Aligheri"));
		libri.add(new Book("Guerra e Pace", 12.0, "Romanzo", "L. Tolstoj"));
		
		stampa(libri);
		
		for(Book libro : libri) {
			libro.applicaSconto(20);
		}
		
		stampa(libri);
		
		libri.sort(Comparator.comparing(Book::getNome));
		
		stampa(libri);
	}
	
	public static void stampa(ArrayList<Book> libri) {
		for(Book libro : libri) {
			System.out.println("Libro: " + libro.getNome() + " Prezzo: " + libro.getPrezzo());
		}
		System.out.println("\n");
	}
}
