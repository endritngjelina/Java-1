package nngjelina15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// Public class calculator
public class Calc extends Application {

	@Override
	// Start method
	public void start(Stage primaryStage) throws Exception {

		// Create calculator
		SimpleCalculator calcPane = new SimpleCalculator();

		primaryStage.setScene(new Scene(calcPane, calcPane.getPrefWidth(), calcPane.getPrefHeight())); // Set primary
																										// scene
		primaryStage.setTitle("Simple Calculator"); // Set title of the calculator
		primaryStage.show(); // Show calculator
	}

	// Main method
	public static void main(String[] args) {
		// Launch
		Application.launch(args);
	}

	// Private class
	private class SimpleCalculator extends GridPane {

		Label number1Label = new Label("Number 1:"); // Number 1 label
		TextField number1Text = new TextField();

		Label number2Label = new Label("Number 2:"); // Number 2 label
		TextField number2Text = new TextField();

		Label resultLabel = new Label("Result:"); // Result label
		TextField resultText = new TextField();

		Button btAdd = new Button("+"); // Addition button
		Button btSubtract = new Button("-"); // Subtraction button
		Button btMultiply = new Button("*"); // Multiplication button
		Button btDivide = new Button("/"); // Division button

		private SimpleCalculator() {

			// Create layout
			setPadding(new Insets(10, 10, 10, 10));
			setAlignment(Pos.CENTER);
			setHgap(10);
			setVgap(10);

			add(number1Label, 0, 0); // Add number1 label and text
			add(number1Text, 1, 0);

			add(number2Label, 0, 1); // Add number2 label and text
			add(number2Text, 1, 1);

			add(resultLabel, 0, 2); // Add result label and text
			add(resultText, 1, 2);

			HBox buttons = new HBox(10); // New HBox for buttons with spacing of 10
			buttons.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
			buttons.setAlignment(Pos.BOTTOM_RIGHT);
			add(buttons, 1, 3);

			// Set button actions
			btAdd.setOnAction(e -> calculate('+'));
			btSubtract.setOnAction(e -> calculate('-'));
			btMultiply.setOnAction(e -> calculate('*'));
			btDivide.setOnAction(e -> calculate('/'));

			// Edit TextField settings
			TextField[] textFields = { number1Text, number2Text, resultText };

			// For each loop
			for (TextField tf : textFields) {
				tf.setAlignment(Pos.BASELINE_RIGHT);
			}
			resultText.setDisable(true);
		}

		// Calculate result method
		private void calculate(char operator) {
			try {
				// Parse number1 and number2
				double number1 = Double.parseDouble(number1Text.getText());
				double number2 = Double.parseDouble(number2Text.getText());
				double result = 0;

				// Perform the operation
				switch (operator) {
				case '+':
					result = number1 + number2;
					break;
				case '-':
					result = number1 - number2;
					break;
				case '*':
					result = number1 * number2;
					break;
				case '/':
					if (number2 != 0) {
						result = number1 / number2;
					} else {
						resultText.setText("Error: Div by 0");
						return;
					}
					break;
				}
				// Display the result
				resultText.setText(String.format("%.2f", result));
			} catch (NumberFormatException ex) {
				resultText.setText("Error: Invalid Input");
			}
		}
	}
}
