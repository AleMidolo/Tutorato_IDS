package org.designPattern.FactoryMethod;

//RUOLO: ConcreteProduct
public class Troll implements Nemico {

	private int vita = 10;
	
	@Override
	public String getNome() {
		return "Troll";
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
