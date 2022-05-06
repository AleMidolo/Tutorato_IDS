package org.designPattern.Facade;

import java.util.Arrays;
import java.util.List;

public class AntiCheat {

	private List<String> blackList = Arrays.asList("spara-coccodrilli", "spara-galline");

	public boolean isCheater(Giocatore g) {
		return blackList.contains(g.getEquip().toLowerCase());
	}
}