package org.designPattern.Singleton;

public class Direttore {

	private static Direttore direttore;
	private String nome;
	private String cognome;
	private String dataDiNascita;
	
	private Direttore() {
		nome = "Mario";
		cognome = "Rossi";
		dataDiNascita = "12/03/1962";
	}
	
	public static Direttore getInstance() {
		if(direttore == null) direttore = new Direttore();
		return direttore;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getDataDiNascita() {
		return dataDiNascita;
	}
}