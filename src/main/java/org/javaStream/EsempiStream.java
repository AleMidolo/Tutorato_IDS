package org.javaStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EsempiStream {

	public static void main(String[] args) {
		
		// Esempio con iterate()
		List<Integer> numbers = Stream.iterate(2, n -> n * 2).
			limit(10).
			collect(Collectors.toList());
			
		System.out.println(numbers);
		
		// Esempio con generate()
		List<Long> randoms = Stream.generate(() -> Math.round(Math.random()*100)).
				limit(10).
				sorted().
				collect(Collectors.toList());

		System.out.println(randoms);
		
		/* IntStream è uno stream che contiene solo valori interi
		* rangeClosed permette di popolare l'IntStream con valori nel range specificao incrementando di 1 per volta
		*/
		IntStream.rangeClosed(1, 6).
			map(x -> x*x).
			forEach(System.out::println);
		
		// il metodo sum() effettua la somma di tutti gli elementi dell'IntStream
		int value = IntStream.rangeClosed(1, 6).
			map(x -> x*x).
			sum();
		System.out.println("Somma con sum(): " + value);
		
		// il metodo mapToInt() restituisce un IntStream eseguendo la funzione passata
		int totaleLunghezze = Stream.of("Odi", "et", "amo", "Quare", "id", "faciam", "fortasse", "requiris").
				mapToInt(s -> s.length()).
				sum();
		
		// il metodo boxed() restituisce uno stream di Integer a partire da un IntStream
		Stream<Integer> streamInteri = IntStream.rangeClosed(1, 6).
			map(x -> x*x).
			boxed();
		
		// esecuzione sequenziale della sort
		long startTime = System.currentTimeMillis();
		List<Long> randomsSeq = Stream.generate(() -> Math.round(Math.random()*100)).
				limit(1000000).
				sorted().
				collect(Collectors.toList());
		long time = System.currentTimeMillis() - startTime;
		System.out.println("Tempo richiesto per l'esecuzione sequenziale: " + time + " millisecondi");
		
		// esecuzione parallela della sort
		startTime = System.currentTimeMillis();
		List<Long> randomsPar = Stream.generate(() -> Math.round(Math.random()*100)).
				limit(1000000).
				parallel().
				sorted().
				collect(Collectors.toList());
		time = System.currentTimeMillis() - startTime;
		System.out.println("Tempo richiesto per l'esecuzione parallela: " + time + " millisecondi");		
	}
}
