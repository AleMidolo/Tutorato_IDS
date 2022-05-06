package org.javaClasses.ClassiAnonime;

public class MainOpr {
	public static void main(String[] args) {
		Calcola calcolaSomma = new Calcola(new Operazione() {
			public void esegui(int x, int y) {
				System.out.println("Somma di " + x + " e " + y + ": " + (x+y));
			}
			
			public void stampa(int x, int y) {
				System.out.println("Stampa: " + x + " " + y);
			}
		});
		calcolaSomma.calcola(5, 3);
		
		Calcola calcolaProdotto = new Calcola(new Operazione() {
			public void esegui(int x, int y) {
				System.out.println("Prodotto di " + x + " e " + y + ": " + (x*y));
			}
			
			public void stampa(int x, int y) {
				System.out.println("Stampa: " + x + " " + y);
			}
		});
		
		calcolaProdotto.calcola(5,3);
		
		//Calcola test = new Calcola(new Operazione());
		
		Calcola somma = new Calcola(new Somma());
		
		somma.calcola(10,22);
		
		
		// e' possibile eseguire questa istruzione SOLO perché l'interfaccia Operazione ha un singolo metodo
		// Calcola sommaFunzionale = new Calcola((a,b) -> System.out.println("Somma \"funzionale\" di " + a + " e " + b + ": " + (a+b)));
		//sommaFunzionale.calcola(5, 9);
	}
}
 