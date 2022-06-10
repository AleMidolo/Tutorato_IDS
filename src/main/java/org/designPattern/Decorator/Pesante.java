package org.designPattern.Decorator;

// ConcreteDecorator
public class Pesante extends Incantesimo {

	public Pesante(Spada s) {
		super(s);
	}

	@Override
	public String getNome() {
		return super.getNome() + " pesante";
	}

	@Override
	public int getDanno() {
		return super.getDanno() + 5;
	}

	// nota: non aggiunge effetti, verrà  usato il metodo nella superclasse

}