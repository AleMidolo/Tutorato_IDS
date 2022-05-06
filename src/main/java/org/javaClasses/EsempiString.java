package org.javaClasses;

public class EsempiString {
	
	/* 
	 * Potete trovare la documentazione relative alla classe Strirng di java nel seguente link
	 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	 */

	public static void main(String[] args) {
		
		System.out.println("Sono una stringa");
		
		char data[] = {'a', 'b', 'c'};
		
		// Esempi di come inizializzare una stringa
		String esempio = "test";
		String alfabeto1 = new String(data); // "abc"
		
		// metodo length() per ottenere il numero di caratteri presenti all'interno della stringa
		// Attenzionare il backslash "\" inserito sotto, serve a fare l'escape del carattere "
		System.out.println("Lunghezza stringa \"esempio\": " + esempio.length());
		System.out.println("Lunghezza stringa \"collezione\": " + alfabeto1.length() + "\n");
		
		// concatenazione di stringhe
		String alfabeto2 = "def";
		String alfabeto = alfabeto1 + alfabeto2;
		
		System.out.println(alfabeto);
		System.out.println("concatenazione di alfabeto1 e alfabeto2: " + alfabeto1.concat(alfabeto2));
		System.out.println(alfabeto1 + "\n");
		
		// verificare se una stringa contiene un dato carattere o sottostringa
		System.out.println("abcdef contiene la stringa abc? " + alfabeto.contains(alfabeto1));
		System.out.println("abcdef contiene la string test? " + alfabeto.contains(esempio) + "\n");
		
		// verificare se due stringhe sono uguali tra di loro
		System.out.println("La variabile alfabeto è uguale alla stringa abcdef? " + alfabeto.equals("abcdef") + "\n");
		
		// sostituire alcuni caratteri o sottostringhe all'interno di una stringa
		System.out.println("Sostituisco abc con 123: " + alfabeto.replace("abc", "123"));
		System.out.println(alfabeto + "\n");
		
		// estrarre una sottostringa
		System.out.println(alfabeto);
		System.out.println("Estraggo dalla variabile alfabeto: " + alfabeto.substring(2));
		System.out.println("Estraggo dall'inizio della variabile: " + alfabeto.substring(2, 5) + "\n");
		
		// modificare da maiuscolo a minuscolo e viceversa
		System.out.println("Variabile alfabeto in maiuscolo: " + alfabeto.toUpperCase());
		String maiuscolo = "ABCD";
		System.out.println("ABCD in minuscolo: " + maiuscolo.toLowerCase());
	}
}