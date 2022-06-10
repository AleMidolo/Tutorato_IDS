package org.designPattern.Mediator.ConMediator;

// ConcreteMediator
public class Mediator implements IMediator {
	private Device tv;
	private Device gs;
	private Device cc;

	@Override
	public void setSmartTv(Device tv) {
		this.tv = tv;
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
	public void smartTvTurnedOn() {
		// nothing to do
	}

	@Override
	public void smartTvTurnedOff() {
		if (gs.isOn()) gs.turnOff();
		if (cc.isOn()) cc.turnOff();
	}

	@Override
	public void gameStationTurnedOn() {
		if (!tv.isOn()) tv.turnOn();
		if (cc.isOn()) cc.turnOff();
	}

	@Override
	public void gameStationTurnedOff() {
		// nothig to do
	}

	@Override
	public void cronCastTurnedOn() {
		if (!tv.isOn()) tv.turnOn();
		if (gs.isOn()) gs.turnOff();
	}

	@Override
	public void cronCastTurnedOff() {
		// nothig to do
	}
	
}