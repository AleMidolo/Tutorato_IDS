package org.designPattern.Mediator.ConMediator;

// Mediator
public interface IMediator {

	public void setSmartTv(Device tv);
	public void setGameStation(Device gs);
	public void setCronCast(Device cc);

	public void smartTvTurnedOn();
	public void smartTvTurnedOff();

	public void gameStationTurnedOn();
	public void gameStationTurnedOff();

	public void cronCastTurnedOn();
	public void cronCastTurnedOff();

}
