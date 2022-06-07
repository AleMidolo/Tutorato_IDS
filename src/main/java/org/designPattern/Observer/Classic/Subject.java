package org.designPattern.Observer.Classic;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> obList = new ArrayList<>();
	
	public void attach(Observer ob) {
		if (! obList.contains(ob)) {
			obList.add(ob);
		}
	}
	
	public void detach(Observer ob) {
		if (obList.contains(ob)) {
			obList.remove(ob);
		}
	}
	
	public void notifyObservers() { 
		for (Observer ob : obList)
			ob.update();
	}
}