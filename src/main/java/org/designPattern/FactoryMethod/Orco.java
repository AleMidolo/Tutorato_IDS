package org.designPattern.FactoryMethod;

//RUOLO: ConcreteProduct
public class Orco implements Nemico {
	
	private int vita = 100;
	
	@Override
	public String getNome() {
		return "Orco";
	}

	@Override
	public void applicaDanno(int danno) {
		if(danno == 6)
			vita = 0;
	}

	@Override
	public boolean isSconfitto() {
		return (vita <= 0);
	}
}
