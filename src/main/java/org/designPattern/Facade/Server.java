package org.designPattern.Facade;

import java.util.ArrayList;
import java.util.List;

public class Server {
	
	private final int capienza;
	private List<Giocatore> listaGiocatori;
	
	public Server(int capienza) {
		this.capienza = capienza;
		this.listaGiocatori = new ArrayList<>();
	}
	
	public boolean isPieno() {
		return listaGiocatori.size() ==  capienza;
	}
	
	public boolean addGiocatore(Giocatore g) {
		if (isPieno()) 
			return false;
		listaGiocatori.add(g);
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("Giocatori attivi: (%d/%d)", listaGiocatori.size(), capienza);
	}
}
