package org.designPattern.Mediator.SenzaMediator;

public class Client {

	public static void main(String[] args) {
		Device tv = new SmartTv();
	    Device gs = new GameStation();
	    Device cc = new CronCast();
	
	    // Assegno le dipendenze per la TV
		tv.setGameStation(gs);
		tv.setCronCast(cc);
		
		// Assegno le dipendenze per la GS
		gs.setSmartTv(tv);
		gs.setCronCast(cc);
		
		// Assegno le dipendenze per la CC
		cc.setSmartTv(tv);
		cc.setGameStation(gs);
		
		gs.turnOn();    // dovrebbe accendere anche la tv
		cc.turnOn();    // dovrebbe spegnere anche la gs
		tv.turnOff();   // dovrebbe spegnere sia il cc che la gs
	}
}