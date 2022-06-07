package org.designPattern.MVC;

public class Controller implements Observer {

	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;

		model.attach(this);
	}

	public void addButtonPressed() {
		try {
			int inc = Integer.parseInt(view.getValue());
			
			if (inc <= 0) {
				view.setErrorMessage("Value must be positive");
				return;
			}

			boolean isOK = model.incCounter(inc);
			if (isOK) {
				view.clearValue();
				view.setInfoMessage("");
			} else {
				view.setWarningMessage("Value is to high");
			}

		} catch (NumberFormatException ex) {
			view.setErrorMessage("Only numeric values are accepted");
		}
	}

	public void resetButtonPressed() {
		model.resetCounter();
	}

	/**
	 * Controller disables the add button
	 * as soon as the counter value inside Model
	 * has reached the max value. The controller can
	 * decide to disable some funzionalities
	 */
	@Override
	public void update() {
		if (model.getValue() >= model.getMax())
			view.setAddEnabled(false);
		else
			view.setAddEnabled(true);
	}
}
