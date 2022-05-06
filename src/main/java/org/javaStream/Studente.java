package org.javaStream;

import java.util.HashMap;

public class Studente {

	private String nome;
	private String cognome;
	private Integer eta;
	private HashMap<String, Integer> materie;
	
	Studente(String nome, String cognome, Integer eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		materie = new HashMap<>();
	}

	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public Integer getEta() {
		return eta;
	}
	
	public HashMap<String, Integer> getMaterie(){
		return materie;
	}
	
	public void aggiungiMateria(String m, Integer v) {
		materie.put(m, v);
	}
}
