package org.designPattern.MVC;

import java.awt.*;
import javax.swing.*;

public class View implements Observer {

	// View uses Swing framework to display UI to user
		private JFrame frame;
		private JLabel countLabel;
		private JLabel infoLabel;
		private JTextField valueTextField;
		private JButton addButton;
		private JButton resetButton;

		private Model model;
		private Controller controller;

		public View(String title) {
			// Set Frame Layout and Size
			frame = new JFrame(title);
			frame.setLayout(new GridLayout(5, 1));
			frame.setSize(300, 200);

			// Create UI elements
			Font hugeFont = new Font("SansSerif", Font.BOLD, 40);
			Font bigFont = new Font("SansSerif", Font.BOLD, 20);
			Font smallFont = new Font("SansSerif", Font.ITALIC, 10);

			countLabel = new JLabel();
			countLabel.setFont(hugeFont);
			countLabel.setHorizontalAlignment(SwingConstants.CENTER);

			infoLabel = new JLabel();
			infoLabel.setFont(smallFont);
			infoLabel.setHorizontalAlignment(SwingConstants.CENTER);

			valueTextField = new JTextField();
			valueTextField.setFont(bigFont);
			
			addButton = new JButton("Add");
			resetButton = new JButton("Reset Counter");

			// Add UI element to frame
			frame.add(countLabel);
			frame.add(infoLabel);
			frame.add(valueTextField);
			frame.add(addButton);
			frame.add(resetButton);

			// Show frame (exit when all frames have been closed)
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		}

		public void setModel(Model model) {
			this.model = model;
			model.attach(this);

			// Update the view with the Model current state
			update();
		}

		public void setController(Controller controller) {
			this.controller = controller;
			
			// Add Listeners
			addButton.addActionListener(e -> controller.addButtonPressed());
			resetButton.addActionListener(e -> controller.resetButtonPressed());
		}

		public void setInfoMessage(String message) {
			infoLabel.setForeground(Color.BLACK);
			infoLabel.setText(message);
		}

		public void setWarningMessage(String message) {
			infoLabel.setForeground(Color.MAGENTA);
			infoLabel.setText(message);
		}

		public void setErrorMessage(String message) {
			infoLabel.setForeground(Color.RED);
			infoLabel.setText(message);
		}

		public String getValue() {
			return valueTextField.getText();
		}

		public void clearValue() {
			valueTextField.setText("");
		}

		public void setAddEnabled(boolean b) {
			addButton.setEnabled(b);
		}

		public void display(int value, int max) {
			countLabel.setText(value + "/" + max);
		}

		/**
		 * View updates itself to reflect the Model state
		 */
		@Override
		public void update() {
			int value = model.getValue();
			int max = model.getMax();
			display(value, max);
		}
}
