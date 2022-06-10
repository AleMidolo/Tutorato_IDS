package org.designPattern.ChainOfResponsibility;

public class HDLivello2 extends HelpDesk {

	public HDLivello2() {
		super(null);
	}
	
	public HDLivello2(HelpDesk successor) {
		super(successor);
	}
	
	@Override
	public void sendTicket(String ticket) {
		if (ticket.contains("server")) {
			System.out.println("Ticket: " + ticket);
			System.out.print("- HD Liv2: ");
			System.out.println("Ha provato a spegnere e riaccendere il server?");
		} else {
			super.sendTicket(ticket);
		}
	}

}
