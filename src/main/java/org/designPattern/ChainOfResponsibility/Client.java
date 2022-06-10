package org.designPattern.ChainOfResponsibility;

public class Client {
	public static void main(String[] args) {
		HelpDesk hd = Creator.premiumHelpDesk();
		
		hd.sendTicket("la stampante continua stampare pagine con scritto -- FreeBot --");
		hd.sendTicket("il server non risponde, tutto il reparto produzione si e' bloccato");
		hd.sendTicket("un robot magazziniere ha preso il capo reparto in ostaggio!");
		hd.sendTicket("l'intero edificio e' sotto il controllo dell'IA ##CrazyRobot##");
	}
}