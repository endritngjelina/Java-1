package ngjelina7;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program finds if a number is inside an array by using throw and catch
//There is the main method and the return index method

//Import Scanner
import java.util.Scanner;

public class Ngjelina7program1 {

public static void main(String[] args) {
		
		//Declare hay stack array
		int[]haystack = { 1, 2, 3, 4, 23, 11, 24, 56, 145, 167, 128, 279, 367, 417, 835};
		
		//Call Scanner
		Scanner number = new Scanner(System.in);
		
		//Prompt user to enter input
		System.out.println("Enter a number to see if it is in the array ");
		
		//Assign input in needle variable
		int needle = number.nextInt();
		
		//Try-catch block
		try {
			
		//Assign index from return Index method
		int index = returnIndex(haystack, needle);
		
		//Display where index is found
		System.out.println("Index is found at " + index); }
		
		//Catch exception
		catch (Exception Ex) {
			
			//End gracefully in element not found in array
			System.out.println(Ex.getMessage());  }
		
		//Close number variable
		number.close();
		}

	//Method for returning Index
	public static int returnIndex(int[ ] haystack, int needle) throws Exception {
		
		//For loop for all elements of array
		for ( int i = 0 ; i < haystack.length; i++) {
			
			//If statement if i is identical to needle
			if(haystack[i] == needle)
				
			//Return i
			return i;
		}  
		//Exception if element is not found in array
		throw new Exception("Element not found in array");
	}
}