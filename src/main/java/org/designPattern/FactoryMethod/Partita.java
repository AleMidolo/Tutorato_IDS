package org.designPattern.FactoryMethod;

import java.util.Random;

public class Partita {

	private static final int DANNO_MASSIMO = 6;
	
	private Dungeon dungeon;
	private int attacchi;
	
	public Partita(Dungeon dungeon, int attacchi) {
		this.dungeon = dungeon;
		this.attacchi = attacchi;
	}
	
	public void gioca() {
		
		Nemico nemico = dungeon.esplora();
		
		while(nemico != null && attacchi > 0) {
			int danno = lanciaDado();
			
			System.out.println("- Infliggo " + danno + " danni a: " + nemico.getNome());
			nemico.applicaDanno(danno);
			
			if (nemico.isSconfitto()) {
				System.out.println(nemico.getNome() +" sconfitto!");
				nemico = dungeon.esplora();
			}
		}
		
		System.out.println(nemico == null ? "Vittoria" : "Sconfitta");
	}
	
	public int lanciaDado() {
		int danno = new Random().nextInt(DANNO_MASSIMO) + 1;
		attacchi--;
		return danno;
	}
}
