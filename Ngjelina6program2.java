package ngjelina6;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program prompts user to enter password that matches a pattern
//It does so by using a regex statement

//Import Scanner
import java.util.Scanner;

public class Ngjelina6program2 {

	public static void main(String[] args) {
		
		//Create String variable
		String password;
		
		Scanner scan = new Scanner(System.in);
		
		//Prompt user to enter password
		System.out.println("Enter Your Password:");
		
		//Set user's input as password
		password = scan.nextLine();
		
		//If password matches pattern, output true
		//If it does not match, output false
		System.out.println(password.matches("[A-Z]+[a-z]{2}\\d{1,2}[A-Z]?[@#$%^&]{2}"));
		scan.close();
	}   
}