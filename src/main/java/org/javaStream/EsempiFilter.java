package org.javaStream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EsempiFilter {

	public static void main(String[] args) {

		Stream<Integer> valori = Stream.of(2, -3, 5, 8, -9, 11, -15);
		
		// estraggo tutti i valori che sono minori o uguali a 0
		Stream<Integer> valoriFiltrati= valori.filter(x -> x <= 0);
		System.out.println("Valori selezionati con semplice filter:");
		valoriFiltrati.forEach(s -> System.out.print(s + " "));
		
		// il Predicate isPositive verifica se un dato numero è positivo o meno, quindi estraggo tutti i valori positivi dallo stream
		Stream<Integer> valori2 = Stream.of(2, -3, 5, 8, -9, 11, -15);
		Predicate<Integer> isPositive = x -> x>=0;
		Stream<Integer> valoriPredicate = valori2.filter(isPositive);
		System.out.println("\nValori filtrati con il predicate:");
		valoriPredicate.forEach(s -> System.out.print(s + " "));
		
		List<String> nomiPersone = List.of("Marco", "Carlo", "Elia", "Giovanni", "Giacomo", "Giorgio", "Carmelo");
		
		// contare quanti nomi di persone hanno meno di 6 caratteri
		long c = nomiPersone.stream().
					filter(s -> s.length() <= 5).
					count();
		
		// contare quanti nomi di persone iniziano per la lettera G
		Predicate<String> inizialeG = s -> s.substring(0, 1).equals("G");
		
		/*Predicate<String> inizialeG = s -> {
			return s.substring(0, 1).equals("G");
		};
		
		Predicate<String> inizialeG = s -> {
			if(s.substring(0, 1).equals("G"))
				return true;
			else
				return false;
		};*/
		
		long c2 = nomiPersone.stream().
					filter(inizialeG).
					count();
		
		System.out.println("\nNumero di persone il cui nome è composta da meno di 6 lettere: " + c);
		System.out.println("Numero di persone il cui nome inizia per G: " + c2);
	}

}
