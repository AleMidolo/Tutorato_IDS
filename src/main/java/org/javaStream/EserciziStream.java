package org.javaStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.javaClasses.libreria.Book;
import org.javaClasses.libreria.Libreria;
import org.javaClasses.libreria.ListaLibri;

public class EserciziStream {

	public static void main(String[] args) {
		List<Double> stipendi = List.of(1200.50, 1100.24, 1465.23, 1876.21, 1954.23, 1395.1, 2452.87);
	
		for(Double stipendio : stipendi){
			if(stipendio > 1500.00)
				System.out.println("Stipendio: " + stipendio);
		}
		
		stipendi.stream().
			filter(x -> x > 1500.00).
			forEach(x -> System.out.println("Stipendio " + x));		
		// SOLUZIONE
		stipendi.stream().
			filter(stipendio -> stipendio > 1500.00).
			forEach(stipendio -> System.out.println("Stipendio: " + stipendio));
		
		Double sommaStipendi = 0.0;
		Optional<Double> sommaStipendiOpt;
		for(Double stipendio : stipendi){
			if(stipendio > 0)
				sommaStipendi += stipendio;
		}

		sommaStipendi = stipendi.stream().filter(i -> i > 0).reduce(0.0, (x,y) -> x+y);
		sommaStipendi = stipendi.stream().filter(i -> i > 0).reduce(0.0, Double::sum);
		sommaStipendiOpt = stipendi.stream().filter(i -> i > 0).reduce(Double::sum);
		
		// SOLUZIONE
		stipendi.stream().
			filter(stipendio -> stipendio > 0).
			reduce(0.0, Double::sum);
		
		
		for(Double stipendio : stipendi){
			if(stipendio > 1500)
				if(stipendio < 2000)
					System.out.println("Stipendio compresi tra 1500 e 2000: " + stipendio);
		}
		
		Predicate<Double> compreso = x -> {
			if(x > 1500 && x < 2000)
				return true;
			return false;
		};
		stipendi.stream().
			//filter(x -> x > 1500 && x < 2000).
			//filter(compreso).
			filter(x -> x > 1500).
			filter(x -> x < 2000).
			forEach(x -> System.out.println(x));
		
		// SOLUZIONE
		stipendi.stream().
			filter(stipendio -> stipendio > 1500 & stipendio < 2000).
			forEach(stipendio -> System.out.println("Stipendio compresi tra 1500 e 2000: " + stipendio));
		
		
		Studente s1 = new Studente("Bianca", "Farina" , 21);
		Studente s2 = new Studente("Gustavo", "LaPasta" , 19);
		Studente s3 = new Studente("Guido", "Lamoto" , 23);
		Studente s4 = new Studente("Bruno", "Biondo" , 22);
		
		List<Studente> studenti = List.of(s1, s2, s3, s4);
		
		// Trovare il nome della persona che è più grande di età tra quelli che hanno meno di 22 anni
		// soluzione imperativa
		Studente sMax = null;
		for(Studente s : studenti) {
			if(s.getEta() < 22) {
				if(sMax == null) sMax = s;
				if(s.getEta() > sMax.getEta()) sMax = s;
			}
		}
		if(sMax!=null) System.out.println("Studente: " + sMax.getNome());
		
		// soluzione funzionale
		Optional<Studente> sMaxF = studenti.stream().
				filter(s -> s.getEta() < 22).
				max(Comparator.comparing(Studente::getEta));
		if(sMaxF.isPresent()) System.out.println("Studente " + sMaxF.get());
		
		
		// esercizi sui libri
		String listaLibri = "C:\\Users\\Ale-m\\Desktop\\Tutorato_IDS\\resources\\Libri.csv";
		
		HashMap<String, ArrayList<String>> mappaLibri = ListaLibri.leggiFile(listaLibri);
		Libreria libreria = new Libreria();
		
		ListaLibri.generaLibri(mappaLibri, libreria);
		
		// estrarre i libri che hanno disponibilità minore di 5
		List<Book> libri = libreria.getLibri();
		
		List<Book> libriPocaDisp = new ArrayList<>();
		// ricerca imperativa
		for(Book b : libri) {
			if(b.getDisponibilità() < 5)
				libriPocaDisp.add(b);
		}
		// ricerca funzionale
		libriPocaDisp = libri.stream().
				filter(b -> b.getDisponibilità() < 5).
				collect(Collectors.toList());
		
		// Calcolare il possibile guadagno da tutti i libri considerando le disponibilità
		
		Double guadagno = 0.0;
		
		// soluzione imperativa
		for(Book b : libri) {
			guadagno += (b.getPrezzo() * b.getDisponibilità());
		}
		
		// soluzione funzionale
		guadagno = libri.stream().
			map(b -> b.getPrezzo() * b.getDisponibilità()).
			reduce(0.0, Double::sum);
		
		
		// Estrarre i libri il cui nome è composto solo da due parole
		List<Book> nomeDueParole = new ArrayList<>();
		
		// soluzione imperativa
		for(Book b : libri) {
			String[] parole = b.getNome().split(" ");
			if(parole.length <= 2)
				nomeDueParole.add(b);
		}
		
		// soluzione funzionale
		nomeDueParole = libri.stream().
			filter(b -> b.getNome().split(" ").length <= 2).
			collect(Collectors.toList());
	}
}
