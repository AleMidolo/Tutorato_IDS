package org.designPattern.Observer.Reactive;

public class Main {

	public static void main(String[] args) {
		AssistenteVocale av = new AssistenteVocale();
		SmartLight ingresso = new SmartLight("ingresso");
		SmartLight salone1 = new SmartLight("salone");
		SmartLight salone2 = new SmartLight("salone");

		av.attach(ingresso);
		av.attach(salone1);
		av.attach(salone2);

		av.registra(new ComandoVocale("accendi luci"));
		attendi(1);  // submit() chiama onNext() in thread separati
		System.out.println();

		av.registra(new ComandoVocale("spegni luci salone"));
		attendi(1);
		System.out.println();
		
		av.registra(new ComandoVocale("spegni luci"));
		attendi(1);
		System.out.println();

		av.close();
		attendi(1);

		// causerebbe: IllegalStateException: Closed
		// av.registra(new ComandoVocale("spegni luci"));
	}

	private static void attendi(int sec) {
		try {
			Thread.sleep(sec * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
