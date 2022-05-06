package org.javaStream;

import java.util.Arrays;
import java.util.List;

public class EsempiFunzionale {

	public static void main(String[] args) {

		List<Integer> valori = Arrays.asList(1, 2, -3, 4, 5, -6, -7, -8, 12);
		
		ricercaImperativa(valori, 3);
		ricercaDichiarativa(valori, 12);
		
		sommaPositiviImperativa(valori);
		sommaPositiviFunzionale(valori);
	}

	public static void ricercaImperativa(List<Integer> valori, Integer val) {
		boolean found = false;
		
		for(Integer i : valori) {
			if(i == val) {
				found = true;
				break;
			}
		}
		
		if(found) System.out.println("Il valore " + val + " è presente nella lista");
		else System.out.println("Il valore " + val + " non è presente nella lista");
	}
	
	public static void ricercaDichiarativa(List<Integer> valori, Integer val) {
		if(valori.contains(val)) System.out.println("Il valore " + val + " è presente nella lista");
		else System.out.println("Il valore " + val + " non è presente nella lista");
	}
	
	public static void sommaPositiviImperativa(List<Integer> valori) {
		Integer somma = 0;
		for(Integer i : valori) {
			if(i >= 0)
				somma += i;
		}
		System.out.println("\n\n\nSomma positivi imperativa: " + somma);
	}
	
	public static void sommaPositiviFunzionale(List<Integer> valori) {
		
		System.out.println("Somma positivi dichiarativa: " + 
				valori.stream().filter(i -> i>=0).reduce(0, Integer::sum));
	}
}
