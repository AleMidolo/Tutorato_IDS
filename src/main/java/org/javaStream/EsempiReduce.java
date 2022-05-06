package org.javaStream;

import java.util.List;
import java.util.Optional;

public class EsempiReduce {

	public static void main(String[] args) {
		
		List<Integer> valori = List.of(2, 3, 13, 11, 2, 5, 8, 12);
		
		
		Integer conto = valori.stream().
				reduce(0, (x, y) -> x+y);
		System.out.println("Somma dei valori con reduce: " + conto);
		
		Integer conto2 = valori.stream().
				reduce(0, Integer::sum);
		
		Optional<Integer> conto3 = valori.stream().
				reduce(Integer::sum);
		
		System.out.println("Somma dei valori con reduce e sum: " + conto2);
		System.out.println("Somma dei valori con reduce e sum + optional: " + conto3.get());
	}
}
