package org.designPattern.ChainOfResponsibility;

public abstract class HelpDesk {
	
	private HelpDesk successor = null;
	
	public HelpDesk(HelpDesk successor) {
		this.successor = successor;
	}

	public void sendTicket(String ticket) {
		if (successor != null) { // se sono qui, la richiesta non è stata gestita, la passo al successore
			successor.sendTicket(ticket); 
		} else { // siamo arrivati alla fine della catena, nessuno ha gestito la richiesta
			System.out.println("Ticket: " + ticket);
			System.out.println("- Il suo piano tariffario non copre il servizio di assistenza richiesto. Buona giornata.");
		}
	}
}