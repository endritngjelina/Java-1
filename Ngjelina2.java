package ngjelina1and2;
import java.util.Scanner;
//SPC ID#2436798
//Endrit Ngjelina
// Worked Alone
//This program converts kg to lbs.
//It propmts user for input and then through a multiplication converts it to lbs.
//It displays the answer in lbs.
public class Ngjelina2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in kg");
		double userinput = input.nextDouble();
		double answer = userinput * 2.205;
		System.out.println( userinput +" kg is equal to "+ answer + " lbs.");
		input.close();

	}

}
