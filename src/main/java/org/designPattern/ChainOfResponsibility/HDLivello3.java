package org.designPattern.ChainOfResponsibility;

public class HDLivello3 extends HelpDesk {
	
	public HDLivello3() {
		super(null);
	}
	
	public HDLivello3(HelpDesk successor) {
		super(successor);
	}
	
	@Override
	public void sendTicket(String ticket) {
		if (ticket.contains("robot")) {
			System.out.println("Ticket: " + ticket);
			System.out.print("- HD Liv3: ");
			System.out.println("Ha provato a spegnere e riaccendere il robot?");
		} else {
			super.sendTicket(ticket);
		}
	}

}
