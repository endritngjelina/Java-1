package ngjelina2;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
// This program picks two random integers between 25 and 75 inclusive
//It displays the positive difference between the two random numbers
//That is possible by using Math class and if-else and else if statements
public class Ngjelina2Part2 {

	public static void main(String[] args) {
//First random integer between 25 and 75 inclusive
	int number1 = 25 + (int)(Math.random()* 51);
//Second random integer between 25 and 75 inclusive
	int number2 = 25 + (int)(Math.random()* 51);
//An if statement if the first number is greater than the second
	if (number1 > number2) {
		System.out.println(number1 + " - " + number2 + " = " + (number1 - number2) ); 	
	}
//An else if statement is the second number is greater than the first
	else if (number2 > number1) {
		System.out.println(number2 + " - " + number1 + " = " + (number2 - number1) );
	}
//An else statement if both the numbers are equal
	else {
		System.out.println(number2 + " - " + number1 + " = 0 ");
		}
	}
}

