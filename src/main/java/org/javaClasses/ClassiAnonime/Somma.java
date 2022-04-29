package org.javaClasses.ClassiAnonime;

class Somma implements Operazione {

	@Override
	public void esegui(int x, int y) {
		System.out.println("Somma di " + x + " e " + y + ": " + (x+y));
	}
	
	@Override
	public void stampa(int x, int y) {
		System.out.println("Stampa: " + x + " " + y);
	}
}
