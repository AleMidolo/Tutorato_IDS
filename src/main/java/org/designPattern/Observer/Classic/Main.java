package org.designPattern.Observer.Classic;

public class Main {

	public static void main(String[] args) {
		AssistenteVocale av = new AssistenteVocale();
		SmartLight ingresso = new SmartLight(av, "ingresso");
		SmartLight salone1 = new SmartLight(av, "salone");
		SmartLight salone2 = new SmartLight(av, "salone");

		av.attach(ingresso);
		av.attach(salone1);
		av.attach(salone2);

		av.registra(new ComandoVocale("accendi luci"));
		av.registra(new ComandoVocale("spegni luci salone"));
		av.registra(new ComandoVocale("spegni luci"));

		av.detach(ingresso);
		av.detach(salone1);
		av.detach(salone2);

		av.registra(new ComandoVocale("spegni luci"));
	}
}
