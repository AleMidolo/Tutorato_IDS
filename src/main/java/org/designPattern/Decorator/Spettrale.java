package org.designPattern.Decorator;

import java.util.List;

// ConcreteDecorator
public class Spettrale extends Incantesimo {
	
	public Spettrale(Spada s) {
		super(s);
	}
	
	@Override
	public String getNome() {
		return super.getNome() + " delle tenebre";
	}

	// nota: non influisce sul danno, verrà  usato il metodo nella superclasse
	
	@Override
	public List<String> getEffetti() {
		List<String> effetti = super.getEffetti();
		effetti.add("paura");
		return effetti;
	}

}