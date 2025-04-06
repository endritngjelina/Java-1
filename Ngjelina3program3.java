package ngjelina3;

//Import Scanner 
import java.util.Scanner;

//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program generates two random single digit integers through an endless infinite while loop
//The user gets to answer multiplication questions and chooses or not to continue
//When the user exits the questions, he gets a result based on right and wrong answered questions
public class Ngjelina3program3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String continuechoice = "y";
	
	//Create variable for total and equal it to zero
	int total = 0;
	//Create variable for correct total and set it to zero
	int correct_total = 0;
	
	//Create a while infinite loop
	while (!continuechoice .equals("n")) { 
		
	//Create random integer
	int number1 = (int)(Math.random() * 10);
	
	//Create a second random integer
	int number2 = (int)(Math.random() * 10);
	
	//Output sample question
	System.out.println("What is " + number1 + " * " + number2 + "? ");
	
	//get input from user
	int answer = input.nextInt();
	
	//Create if statement if answer is correct
	if (number1 * number2 == answer) {
		System.out.println("Correct. Nice Work!");
		
	//Add 1 to their correct total for each correct answer
	correct_total += 1;
	}
	
	//Display the incorrect message if user does not input the correct answer
	else {
		System.out.println("Incorrect. The product is " + number1 * number2 + ". ");
	}
	
	//Increase the total variable by 1 for each question that user faces
	total ++;
	
	//Print option to continue or to opt out of further questions
	System.out.println("Want more questions y or n ? ");
	continuechoice = input.next();	
	}	
	
	//Close input variable
	input.close();
	
	//Print the final score when user decides to terminate loop
	System.out.println("You scored " + correct_total + " out of " + total + ". ");	
	}
}
