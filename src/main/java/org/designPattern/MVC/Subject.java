package org.designPattern.MVC;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	List<Observer> observerList = new ArrayList<>();

	public void attach(Observer obs) {
		if (! observerList.contains(obs))
			observerList.add(obs);
	}

	protected void notifyObservers() {
		observerList.forEach(Observer::update);
	}
}
