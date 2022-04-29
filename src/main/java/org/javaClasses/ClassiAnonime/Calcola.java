package org.javaClasses.ClassiAnonime;

public class Calcola {

	private Operazione opr;
	
	public Calcola(Operazione o) {
		opr = o;
	}
	
	public void calcola(int x, int y) {
		opr.esegui(x, y);
	}
}
