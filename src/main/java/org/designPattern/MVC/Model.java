package org.designPattern.MVC;

public class Model extends Subject {
	private int value;
	private int max;

	public Model(int max) {
		this.value = 0;
		this.max = max;
	}

	public int getValue() {
		return value;
	}

	public int getMax() {
		return max;
	}

	public boolean incCounter(int inc) {
		if (value + inc > max) return false;
		
		value += inc;
		notifyObservers();
		return true;
	}

	public void resetCounter() {
		value = 0;
		notifyObservers();
	}
}
