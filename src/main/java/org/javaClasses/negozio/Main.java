package org.javaClasses.negozio;

public class Main {

	public static void main(String[] args) {
		
		CapoArea capoTelevisori = new CapoArea("Carlo", "Samsung", "12/02/81", 1900.00, Area.TELEVISORI);

		AddettoVendite addetto1 = new AddettoVendite("Giorgio", "Mastrota", "15/5/1964", 1200.00);
		AddettoVendite addetto2 = new AddettoVendite("Carlo", "Conti", "13/3/1961", 1150.00);
		AddettoVendite addetto3 = new AddettoVendite("Amedeo", "Sebastiani", "4/9/1962", 1100.00);
		
		capoTelevisori.aggiungiAddetto(addetto1);
		capoTelevisori.aggiungiAddetto(addetto2);
		capoTelevisori.aggiungiAddetto(addetto3);
		
		for(AddettoVendite ad : capoTelevisori.getAddetti()) {
			System.out.println(ad.getNome() + " " + ad.getCognome() + " " + ad.getDataDiNascita() + " " + ad.getStipendio());
		}
		System.out.println("\n");
	}
}
