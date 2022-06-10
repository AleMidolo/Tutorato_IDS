package org.designPattern.ChainOfResponsibility;

public class Creator {

	private Creator() {}

	public static HelpDesk basicHelpDesk() {
		return new HDLivello1();
	}
	
	public static HelpDesk businessHelpDesk() {
		return new HDLivello1(new HDLivello2());
	}
	
	public static HelpDesk premiumHelpDesk() {
		return new HDLivello1(new HDLivello2(new HDLivello3()));
	}

}
