package ngjelina3;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program displays the list of temperatures in Fahrenheit and Celsius
//The Fahrenheit temperatures are from -40F until 120 with an increment of 5F
//Their equivalent in degrees Celsius in displayed in the other table.
public class Ngjelina3program2 {

	public static void main(String[] args) {
		
		//Create double for celsius
		double celsius = 0;
		
	 //Create for loop for all of the Fahrenheit temperatures between -40 and 120
	 for ( int i = -40; i < 120; i += 5) {
		 
		 //Calculate the conversion between Fahrenheit and Celsius
		 celsius = ( i - 32) * (5.0 / 9.0 );
	
	 //Print the Fahrenheit column with 20 characters wide and F symbol
	 System.out.print(String.format("%-20s", i + " F"));
	 
	 //Display the Celsius column with 2 decimal points and C symbol
	 System.out.printf("%.2f C", celsius);
	 
	 //Print empty space so that it is in the column shape
	 System.out.println();
	 	}
	}
}
