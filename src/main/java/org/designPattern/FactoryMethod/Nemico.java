package org.designPattern.FactoryMethod;

//RUOLO: Product
public interface Nemico {

	public String getNome();
	public void applicaDanno(int danno);
	public boolean isSconfitto();
}