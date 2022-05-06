package org.javaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EsempiMap {

	public static void main(String[] args) {
		
		Studente s1 = new Studente("Bianca", "Farina" , 21);
		Studente s2 = new Studente("Gustavo", "LaPasta" , 19);
		Studente s3 = new Studente("Guido", "Lamoto" , 23);
		Studente s4 = new Studente("Bruno", "Biondo" , 22);
		
		List<Studente> studenti = List.of(s1, s2, s3, s4);
		
		// Uso la map per estrarre l'età da ogni studente e con la reduce sommo tutte le età
		Integer totaleEta = studenti.stream().
				map(Studente::getEta).
				reduce(0, Integer::sum);
		System.out.println("Totale eta degli studenti: " + totaleEta + "\n");

		// Uso la map per estrarre tutti i nomi degli studenti
		Stream<String> nomiStudenti = studenti.stream().
				map(Studente::getNome);
				//map(s -> s.getNome());
		List<String> nomiStudentiLista = studenti.stream().
				map(Studente::getNome).
				collect(Collectors.toList());
		nomiStudenti.forEach(n -> System.out.println("Nome: " + n));
		System.out.println(nomiStudentiLista);
		System.out.println("\n");
		
		// Estraggo i nomi degli studenti e verifico quali di questi iniziano con la B; quindi li inserisco all'interno di una lista
		List<String> nomiInizialiB = studenti.stream().
				map(s -> s.getNome()).
				filter(nome -> nome.startsWith("B")).
				collect(Collectors.toList());
				//collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Studenti il cui nome inizia con la B: \n" + nomiInizialiB + "\n");
		
		// calcolo l'ID di uno studente concatenando la prima lettera del nome e quella del cognome, entrambe in maiuscolo
		// utilizzo la Function poiché l'operazione che voglio effettuare è un po' più complessa
		Function<Studente, String> computeId = x -> {
			String id = "";
			id += x.getNome().substring(0, 1).toUpperCase();
			id += x.getCognome().substring(0, 1).toUpperCase();
			return id;
		};
		// quindi genero tutti gli ID grazie alla MAP e li salvo all'interno di una Lista
		ArrayList<String> allId = studenti.stream().
				map(computeId).
				collect(Collectors.toCollection(ArrayList::new));
				//collect(Collectors.toCollection(HashSet::new));
				//collect(Collectors.toList());
		
		System.out.println("Id degli studenti: " + allId);
	}
}
