package org.designPattern.Decorator;

public class Emporio {
	private Emporio() {}
	
	public static Spada compraSpada() {
		return new SpadaBase();
	}
	
	public static Spada compraSpadaInfuocata() {
		return new Infuocata(new SpadaBase());
	}
	
	public static Spada compraSpadaSpettraleInfuocata() {
		return new Spettrale(new Infuocata(new SpadaBase()));
	}

	public static Spada compraSpadaInfuocataPesante() {
		return new Infuocata(new Pesante(new SpadaBase()));
	}

	public static Spada compraSpadaPesanteInfuocata() {
		return new Pesante(new Infuocata(new SpadaBase()));
	}

	public static Spada compraSpadaMoltoPesante() {
		return new Pesante(new Pesante(new SpadaBase()));
	}

}