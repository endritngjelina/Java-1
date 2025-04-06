package ngjelina2;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program prompts user to input number of shirts they want to buy
//It calculates the total cost based on how many you order
//It displays the shipping, the discounted price and the extended price
import java.util.Scanner;
public class Ngjelina2Part3 {
	public static void main(String[] args) {
//Get input from user
		Scanner input = new Scanner(System.in);
		System.out.println("How many shirts would you like to buy: ");
		int quantity = input.nextInt();
//Create variable for shipping
		double ship = 0.0;
//Create variable for discount
		double discount = 0.0;
//Create variable for price
		double price = 24.95;
//Create if-else if and else statements for subdivisions
		if (quantity <= 2){
			ship = 6.99;
			discount = 0.0;}
		else if ( quantity <= 6) {
			ship = 5.49;
			discount = 0.1;}
		else if ( quantity <= 9) {
			ship = 4.00;
			discount = 0.2;}
		else {
			ship = 0.0;
			discount = 0.3;}
//Calculate extended price
		double extended_price = quantity * price;
//Calculate discounted price
		double discounted_price = quantity * price * discount;
//Calculate total cost
		double cost = ((quantity * price) - (quantity * price * discount)) + ship;
//Display the extended price
		System.out.println("The extended price is " + extended_price + "$.");
//Display the discounted price
		System.out.printf("The discounted price is %.2f $. \n",discounted_price);
//Display the shipping cost
		System.out.println("The shipping cost is " + ship + "$.");
//Display the total cost
		System.out.printf("The total cost is %.2f $.", cost);
	}
}
