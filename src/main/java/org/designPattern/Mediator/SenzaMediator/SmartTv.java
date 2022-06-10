package org.designPattern.Mediator.SenzaMediator;

public class SmartTv implements Device {
	Device gs;
	Device cc;
	boolean isOn = false;

	@Override
	public void turnOn() {
		System.out.println(" - Turning SmartTv ON");
		isOn = true;
	}

	@Override
	public void turnOff() {
		System.out.println(" - Turning SmartTv OFF");
		if (gs.isOn()) gs.turnOff();
		if (cc.isOn()) cc.turnOff();
		isOn = false;
	}

	@Override
	public void setGameStation(Device gs) {
		this.gs = gs; 
	}

	@Override
	public void setCronCast(Device cc) {
		this.cc = cc;
	}

	@Override
	public void setSmartTv(Device tv) {
		// vuoto
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

}
