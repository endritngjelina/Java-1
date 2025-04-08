package ngjelina5;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program adds 8 random integers into an array between 50 and 100 inclusive
//The array is sorted in another method and returns another array with largest and smallest integers
//It displays the sorted array, largest and smallest integers, how many odd/even integers and their sum

//Import Random and Arrays
import java.util.Arrays;
import java.util.Random;

public class Ngjelina5program1 {

	public static void main(String[] args) {
		
		 //Set even/total and odd to 0
		 int even = 0;
		 int total = 0;
	     int odd = 0;
	     
	     //Create array
	     int[] randomEight =  new int[8];
	     
	     //Create random 
	     Random random = new Random();
	     
	     //For loop for 8 integers
	     for (int i = 0; i < 8; i++){
	         randomEight [i] = random.nextInt((100 - 50) + 1) + 50;
	        }
	        int [] newarray = numbers(randomEight);
	        
	        //Output the lowest and highest element
	        System.out.println("The lowest element is " + newarray[0]);
	        System.out.println("The highest element is " + newarray[1]);
	        
	        //For each loop for randomEight array
	        for(int item: randomEight){
	        	
	        	//If - else statement to determine how many even or odd values in array
	            if(item % 2 == 0){
	               even++;
	           } 
	           else {
	               odd++;
	           }
	            
	            //Sum of all items is total
	            total += item;
	            
	            //Print all items with space in between
	            System.out.print(item + " ");
	        }
	        
	        System.out.println(" ");
	        
	        //Display how many evens or odds there are
	        System.out.println("Evens: " + even + " , odds: " + odd);
	        
	        //Print total
	        System.out.println("Total: " + total);
	}
	public static int[] numbers( int[]randomEight){
		
		//Create new array
		int [] newarray = new int [2];
		
		//Sort original array
		Arrays.sort(randomEight);
		
		//Set largest and smallest values to new array
		newarray [0] = randomEight[0];
		newarray [1] = randomEight[7];
		
		//Return new array
        return newarray; 
        }
}