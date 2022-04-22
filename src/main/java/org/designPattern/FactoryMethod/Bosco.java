package org.designPattern.FactoryMethod;

// RUOLO: ConcreteCreator
public class Bosco extends Dungeon {

	@Override
	protected Nemico getNemico(TipoNemico tipo) {
		switch(tipo) {
			case BASE: return new Goblin();
			case ELITE: return new Goblin();
			case BOSS: return new Troll();
			default: return null;
		}
	}	
}
