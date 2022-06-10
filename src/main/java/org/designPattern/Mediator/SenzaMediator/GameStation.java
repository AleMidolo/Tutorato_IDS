package org.designPattern.Mediator.SenzaMediator;

public class GameStation implements Device {
	Device tv;
	Device cc;
	boolean isOn = false;

	@Override
	public void turnOn() {
		System.out.println(" - Turning GameStation ON");
		if (!tv.isOn()) tv.turnOn();
		if (cc.isOn()) cc.turnOff();
		isOn = true;
	}

	@Override
	public void turnOff() {
		System.out.println(" - Turning GameStation OFF");
		isOn = false;
	}

	@Override
	public void setGameStation(Device gs) {
		// nothing to do
	}

	@Override
	public void setCronCast(Device cc) {
		this.cc = cc;
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
