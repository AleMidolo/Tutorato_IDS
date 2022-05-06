package org.javaClasses;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class EsempiMap {

	/* 
	 * Potete trovare la documentazione relative alla classe List e ArrayList di java nei seguenti links
	 * https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
	 * https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
	 */
	public static void main(String[] args) {

		HashMap<String,String> capitali = new HashMap<>();
		
		// inserimento di una coppia "chiave-valore"
		capitali.put("Italia", "Catania");
		System.out.println(capitali);
		capitali.put("Italia", "Roma");
		System.out.println(capitali + "\n");
		
		capitali.put("Germania", "Berlino");
		capitali.put("Francia", "Parigi");
		capitali.put("Spagna", "Madrid");
		
		System.out.println("La capitale della Germania è: " + capitali.get("Germania") + "\n");
		
		// rimozione delle coppia associata alla chiave passata come parametro
		capitali.remove("Germania");
		System.out.println(capitali + "\n");
		
		// insieme delle chiavi
		Set<String> chiavi = capitali.keySet();
		// insieme dei valori
		ArrayList<String> valori = new ArrayList<>(capitali.values());
		
		System.out.println("Insieme delle chiavi: " + chiavi);
		System.out.println("Insieme dei valori: " + valori + "\n");
		
		for(String chiave : chiavi) {
			System.out.println("Nazione: " + chiave);
		}
		System.out.println("\n");
		
		for(String valore : valori) {
			System.out.println("Capitale: " + valore);
		}
		System.out.println("\n");
		
		for(String chiave : chiavi) {
			System.out.println("Nazione: " + chiave + ", Capitale: " + capitali.get(chiave));
		}
		System.out.println("\n");
	}
}
