package nngjelina15;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone

//This program calculates the future value of an initial investment 
//That is at a given interest rate in a specified number of years. 

//Import java fx files
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

//Public class calculator
public class Calculator extends Application {

	@Override

	// Start method
	public void start(Stage primaryStage) throws Exception {

		// Create calculator
		LoanInvestCalculator calcPane = new LoanInvestCalculator();

		primaryStage.setScene(new Scene(calcPane, calcPane.getPrefWidth(), calcPane.getPrefHeight())); // Set primary
																										// scene
		primaryStage.setTitle("Investment Calculator"); // Set title of the calculator
		primaryStage.show(); // Show calculator
	}

	// Main method
	public static void main(String[] args) {
		// Launch
		Application.launch(args);
	}

	// Private class
	private class LoanInvestCalculator extends GridPane {

		Label amountLabel = new Label("Investment Amount:"); // Investment amount label
		TextField amountText = new TextField();

		Label yearsLabel = new Label("Years:"); // Years label
		TextField yearsText = new TextField();

		Label rateLabel = new Label("Annual Interest Rate:"); // Interest rate label
		TextField rateText = new TextField();

		Label futureValueLabel = new Label("Future Value:"); // Future value label
		TextField futureValueText = new TextField();

		Button btCalc = new Button("Calculate"); // Calculate button

		private LoanInvestCalculator() {

			// Create layout
			setPadding(new Insets(10, 10, 10, 10));
			setAlignment(Pos.CENTER);
			setHgap(10);
			setVgap(10);

			add(amountLabel, 0, 0); // Add amount label and text
			add(amountText, 1, 0);

			add(yearsLabel, 0, 1); // Add years label and text
			add(yearsText, 1, 1);

			add(rateLabel, 0, 2); // Add rate label and text
			add(rateText, 1, 2);

			add(futureValueLabel, 0, 3);// Add future value label and text
			add(futureValueText, 1, 3);

			HBox button = new HBox(); // New button
			button.getChildren().add(btCalc);
			button.setAlignment(Pos.BOTTOM_RIGHT);
			add(button, 1, 4);
			btCalc.setOnAction(e -> calcFutureValue());

			// Edit TextField settings
			TextField[] textFields = (TextField[]) getArray(amountText, yearsText, rateText, futureValueText);

			// For each loop
			for (TextField tf : textFields) {
				tf.setAlignment(Pos.BASELINE_RIGHT);
			}
			futureValueText.setDisable(true);

		}

		private Object[] getArray(Object... objects) {

			// Object array
			Object[] temp = new TextField[objects.length];
			for (int i = 0; i < objects.length; i++) {
				temp[i] = objects[i];
			}
			// Return temp
			return temp;
		}

		// Calculate future value method
		public void calcFutureValue() {

			// parse investment amount,years, interest rate and future value
			double investmentAmount = Double.parseDouble(amountText.getText());
			double years = Double.parseDouble(yearsText.getText());
			double monthInterestRate = Double.parseDouble(rateText.getText()) / 12 / 100;
			double futureValue = investmentAmount * Math.pow(1 + monthInterestRate, years * 12);
			futureValueText.setText(String.format("$%.2f", futureValue));
		}
	}
}
