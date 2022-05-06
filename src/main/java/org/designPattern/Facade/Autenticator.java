package org.designPattern.Facade;

import java.util.ArrayList;
import java.util.List;

public class Autenticator {

	private List<Integer> idGiocatori = new ArrayList<>();
	
	public boolean isRegistrato(Giocatore g) {
		return idGiocatori.contains(g.getId());
	}
	
	public boolean registraGiocatore(Giocatore g) {
		if(idGiocatori.contains(g.getId())) {
			System.out.println("Giocatore già registrato");
			return false;
		}
		idGiocatori.add(g.getId());
		return true;
	}
}
