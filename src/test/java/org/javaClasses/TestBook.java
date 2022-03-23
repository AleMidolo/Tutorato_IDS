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
		
		testAggiungiDisponibilità(libro, 5);
		testAggiungiDisponibilità(libro, 0);
		testAggiungiDisponibilità(libro, -1);
		System.out.println("\n");
		
		testSottraiDisponibilità(libro, 5);
		testSottraiDisponibilità(libro, 0);
		testSottraiDisponibilità(libro, 10);
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
	
	private static void testAggiungiDisponibilità(Book libro, int disp) {
		libro.aggiungiDisponibilità(disp);
		if(libro.getDisponibilità() == 6)
			System.out.println("Test aggiungi disponibilità \"" + disp + "\" passato");
		else
			System.out.println("Test aggiungi disponibilità fallito");
	}
	
	private static void testSottraiDisponibilità(Book libro, int disp) {
		libro.sottraiDisponibilità(disp);
		if(libro.getDisponibilità() == 1)
			System.out.println("Test sottrai disponibilità \"" + disp + "\" passato");
		else
			System.out.println("Test sottrai disponibilità fallito");
	}
}
