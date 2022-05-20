package org.designPattern.State;

// RUOLO: State
public interface Stato {

	public Stato esegui(int s);
	public Stato ricarica();
	public Stato ripara();
}
