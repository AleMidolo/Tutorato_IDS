package org.designPattern.Decorator;

import java.util.List;

// ConcreteDecorator
public class Infuocata extends Incantesimo {

	public Infuocata(Spada s) {
		super(s);
	}
	
	@Override
	public String getNome() {
		return super.getNome() + " infuocata"; // con super accedo al component
	}

	@Override
	public int getDanno() {
		return super.getDanno() * 2; // con super accedo al component
	}

	@Override
	public List<String> getEffetti() {
		List<String> effetti = super.getEffetti(); // con super accedo al component
		effetti.add("ustione");
		return effetti;
	}
}