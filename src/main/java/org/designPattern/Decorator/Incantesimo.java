package org.designPattern.Decorator;

import java.util.List;

// Decorator
public class Incantesimo implements Spada {

	private Spada component;
	
	public Incantesimo(Spada s) {
		component = s;
	}
	
	@Override
	public String getNome() {
		return component.getNome();
	}

	@Override
	public int getDanno() {
		return component.getDanno();
	}

	@Override
	public List<String> getEffetti() {
		return component.getEffetti();
	}

}