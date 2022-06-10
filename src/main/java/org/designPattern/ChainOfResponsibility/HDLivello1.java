package org.designPattern.ChainOfResponsibility;

public class HDLivello1 extends HelpDesk {

	public HDLivello1() {
		super(null);
	}
	
	public HDLivello1(HelpDesk successor) {
		super(successor);
	}
	
	@Override
	public void sendTicket(String ticket) {
		if (ticket.contains("stampante")) {
			System.out.println("Ticket: " + ticket);
			System.out.print("- HD Liv1: ");
			System.out.println("Ha provato a spegnere e riaccendere la stampante?");
		} else {
			super.sendTicket(ticket); // la chiamata a super mi porta al successivo
		}
	}

	

}
