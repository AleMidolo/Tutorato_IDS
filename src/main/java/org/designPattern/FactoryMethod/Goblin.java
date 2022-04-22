package org.designPattern.FactoryMethod;

//RUOLO: ConcreteProduct
public class Goblin implements Nemico {

	private int vita = 5;
	
	@Override
	public String getNome() {
		return "Goblin";
	}

	@Override
	public void applicaDanno(int danno) {
		vita -= danno;		
	}

	@Override
	public boolean isSconfitto() {
		return (vita <= 0);
	}
}
