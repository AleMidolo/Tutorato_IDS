package org.designPattern.Adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		testAggiungiCliente();
		testGetNomeCliente();
		testRimuoviCliente();
		testGetNumeroClienti();
	}

	private static void testAggiungiCliente() {
		InterfacciaClienti gestore = new AdapterClienti();	
		gestore.aggiungiCliente("Mario", "Rossi");
		if(!gestore.aggiungiCliente("Mario", "Rossi")) System.out.println("OK testAggiungiCliente\n");
		else System.out.println("FALLITO testAggiungiCLiente\n");
	}
	
	private static void testGetNomeCliente() {
		InterfacciaClienti gestore = new AdapterClienti();
		if(gestore.getNomeCliente("Mario").equals("")) System.out.println("OK testGetNomeCliente\n");
		else System.out.println("FALLITO testGetNomeCliente\n");
	}
	
	private static void testRimuoviCliente() {
		InterfacciaClienti gestore = new AdapterClienti();
		gestore.aggiungiCliente("Mario", "Rossi");
		if(gestore.rimuoviCliente("Mario", "Rossi")) System.out.println("OK testRimuoviCliente\n");
		else System.out.println("FALLITO testRimuoviCliente\n");
	}
	
	private static void testGetNumeroClienti() {
		InterfacciaClienti gestore = new AdapterClienti();
		gestore.aggiungiCliente("Mario", "Rossi");
		gestore.aggiungiCliente("Guido", "Lamoto");
		gestore.aggiungiCliente("Giorgio", "Bianchi");
		
		if(gestore.getNumeroClienti() == 3) System.out.println("OK testGetNumeroClienti\n");
		else System.out.println("FALLITO testGetNumeroClienti\n");
	}
}
