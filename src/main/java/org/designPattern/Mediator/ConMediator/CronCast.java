package org.designPattern.Mediator.ConMediator;

// ConcreteColleague
public class CronCast implements Device {
	private Mediator m;
	private boolean isOn = false;

	public CronCast(Mediator m) {
		this.m = m;
	}

	@Override
	public void turnOn() {
		System.out.println(" - Turning CronCast ON");
		isOn = true;
		m.cronCastTurnedOn();
	}

	@Override
	public void turnOff() {
		System.out.println(" - Turning CronCast OFF");
		isOn = false;
		m.cronCastTurnedOff();
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

}
