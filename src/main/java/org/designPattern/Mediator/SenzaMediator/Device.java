package org.designPattern.Mediator.SenzaMediator;

public interface Device {
	public void turnOn();
	public void turnOff();
	public void setGameStation(Device gs);
	public void setCronCast(Device cc);
	public void setSmartTv(Device tv);
	public boolean isOn();
}