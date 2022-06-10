package org.designPattern.Decorator;

public class TestSpada {
	public static void main(String[] args) {
		print(Emporio.compraSpada());
		print(Emporio.compraSpadaInfuocata());
		print(Emporio.compraSpadaSpettraleInfuocata());
		print(Emporio.compraSpadaInfuocataPesante()); // l'ordine può essere importante!
		print(Emporio.compraSpadaPesanteInfuocata());
		print(Emporio.compraSpadaMoltoPesante());
	}

	private static void print(Spada s) {
		System.out.println();
		System.out.println(s.getNome() + ": " + s.getDanno() + " danni");
		System.out.println("Effetti:");
		s.getEffetti().forEach(e -> System.out.println("- " + e));
	}

}