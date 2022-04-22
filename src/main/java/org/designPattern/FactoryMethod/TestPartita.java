package org.designPattern.FactoryMethod;

public class TestPartita {

	public static void main(String[] args) {
		
		System.out.println("# Avvio partita nel Bosco con 10 attacchi");
		new Partita(new Bosco(), 15).gioca();

		System.out.println("\n\n\n# Avvio partita nella Landa con 10 attacchi");
		new Partita(new Landa(), 10).gioca();
	}
}
