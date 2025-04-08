package ngjelina5;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program takes variable numbers and returns their sum
//It displays the integers that are entered in command line. 
//It displays the sum it returns.

public class Ngjelina5program2 {

	public static void main(String[] args) {
		
		  //Display integers
		  System.out.print("Passing [ ");
		  	
		  	//for loop for variables
	        for (int i = 0; i < args.length; i++) {
	        	
	        	//Display variables
	            System.out.print(args[i] + " ");
	        }
	        System.out.print("]");
	        
	        //Display the sum
	        System.out.println("\nSum is: " + sumInts(args));
	    }

	    public static int sumInts(String[] args) {
	    	
	    	//Set sum as 0
	        int sum = 0;
	        
	        //For loop for variables
	        for (int i = 0; i < args.length; i++) {
	        	
	        	//Get the sum
	            sum += Integer.parseInt(args[i]);
	        }
	        //Return sum
	        return sum;
	    }
}