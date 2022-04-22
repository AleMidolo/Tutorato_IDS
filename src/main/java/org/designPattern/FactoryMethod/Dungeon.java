package org.designPattern.FactoryMethod;

// RUOLO: Creator
public abstract class Dungeon {

	public enum TipoNemico {BASE, ELITE, BOSS}
	
	private int livello = 0;
	
	public Nemico esplora() {
		Nemico next;
		
		switch(livello) {
			case 0: next = getNemico(TipoNemico.BASE); break;
			case 1: next = getNemico(TipoNemico.BASE); break;
			case 2: next = getNemico(TipoNemico.ELITE); break;
			case 3: next = getNemico(TipoNemico.BOSS); break;
			default: next =  null;
		}
		livello++;
		return next;
	}

	protected abstract Nemico getNemico(TipoNemico tipo);
}
