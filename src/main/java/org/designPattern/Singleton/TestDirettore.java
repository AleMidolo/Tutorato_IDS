package org.designPattern.Singleton;

public class TestDirettore {

	public static void main(String[] args) {
		
		Direttore direttore = Direttore.getInstance();
		System.out.println(direttore.getNome());
		System.out.println(direttore.getCognome());
		System.out.println(direttore.getDataDiNascita());
		
		Direttore direttore2 = Direttore.getInstance();
		System.out.println(direttore2.getNome());
		System.out.println(direttore2.getCognome());
		System.out.println(direttore2.getDataDiNascita());
		
		//Direttore direttore3 = new Direttore();
	}
}
