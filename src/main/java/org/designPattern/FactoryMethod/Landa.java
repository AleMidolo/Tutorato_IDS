package org.designPattern.FactoryMethod;

// RUOLO: ConcreteCreator
public class Landa extends Dungeon {

	@Override
	protected Nemico getNemico(TipoNemico tipo) {
		switch(tipo) {
			case BASE: return new Goblin();
			case ELITE: return new Troll();
			case BOSS: return new Orco();
			default: return null;
		}
	}
}