package org.designPattern.Mediator.SenzaMediator;

public class CronCast implements Device {
	Device tv;
	Device gs;
	boolean isOn = false;

	@Override
	public void turnOn() {
		System.out.println(" - Turning CronCast ON");
		if (!tv.isOn()) tv.turnOn();
		if (gs.isOn()) gs.turnOff();
		isOn = true;
	}

	@Override
	public void turnOff() {
		System.out.println(" - Turning CronCast OFF");
		isOn = false;
	}

	@Override
	public void setGameStation(Device gs) {
		this.gs = gs;
	}

	@Override
	public void setCronCast(Device cc) {
		// nothig to do
	}

	@Override
	public void setSmartTv(Device tv) {
		this.tv = tv;
	}

	@Override
	public boolean isOn() {
		return isOn;
	}
}
