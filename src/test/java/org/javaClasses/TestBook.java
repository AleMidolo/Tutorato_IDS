package org.javaClasses;

import org.javaClasses.libreria.Book;

public class TestBook {

	public static void main(String[] args) {
		Book libro = new Book("La forma dell'acqua", 5.0, "Giallo");
		testPrezzo(libro, 20);
		testPrezzo(libro, -5);
		System.out.println("\n");
		
		testSconto(libro, 20);
		testSconto(libro, 100);
		testSconto(libro, 0);
		System.out.println("\n");
		
		testAggiungiDisponibilit�(libro, 5);
		testAggiungiDisponibilit�(libro, 0);
		testAggiungiDisponibilit�(libro, -1);
		System.out.println("\n");
		
		testSottraiDisponibilit�(libro, 5);
		testSottraiDisponibilit�(libro, 0);
		testSottraiDisponibilit�(libro, 10);
		System.out.println("\n");
	}
	
	private static void testPrezzo(Book libro, double prezzo) {
		libro.setPrezzo(prezzo);
		if(libro.getPrezzo() == 20)
			System.out.println("Test prezzo \"" + prezzo + "\" passato");
		else
			System.out.println("Test prezzo \"" + prezzo + "\" fallito");
	}
	
	private static void testSconto(Book libro, int sconto) {
		libro.applicaSconto(sconto);
		if(libro.getPrezzo() == 16.0)
			System.out.println("Test sconto " + sconto + "% passato");
		else
			System.out.println("Test sconto " + sconto + "% fallito");
	}
	
	private static void testAggiungiDisponibilit�(Book libro, int disp) {
		libro.aggiungiDisponibilit�(disp);
		if(libro.getDisponibilit�() == 6)
			System.out.println("Test aggiungi disponibilit� \"" + disp + "\" passato");
		else
			System.out.println("Test aggiungi disponibilit� fallito");
	}
	
	private static void testSottraiDisponibilit�(Book libro, int disp) {
		libro.sottraiDisponibilit�(disp);
		if(libro.getDisponibilit�() == 1)
			System.out.println("Test sottrai disponibilit� \"" + disp + "\" passato");
		else
			System.out.println("Test sottrai disponibilit� fallito");
	}
}
