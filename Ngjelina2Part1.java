package ngjelina2;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program prompts user for their full name
//It displays the length of their full name plus the spaces in between
// It shows how many letters long the middle name is
//Its displays the initials and the full name in all upper case letters
import java.util.Scanner;
public class Ngjelina2Part1 {
	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		//Get input from user for their name
		System.out.println("Enter a first name middle name and surname ");
		String name = bucky.nextLine();
//Display the number of characters in the user's name
		System.out.println("Length of your name: " + name.length() + " characters.");
//Separate the full name into sections 
		String firstName = name.substring(0, name.indexOf(" "));
		String middleName = name.substring(name.indexOf(" ")+1, name.lastIndexOf(" "));
		String lastName = name.substring(name.lastIndexOf(" ")+1);
//Display the number of characters of the middle name
		System.out.println("Length of your middle name is " + middleName.length());
//Print the initials of the full name
		System.out.println(Character.toString(firstName.charAt(0)) + Character.toString(middleName.charAt(0)) + Character.toString(lastName.charAt(0)));
// Print full name in all upper case letters
		System.out.println(firstName.toUpperCase() + " " + middleName.toUpperCase() + " " + lastName.toUpperCase());
	}	
}


