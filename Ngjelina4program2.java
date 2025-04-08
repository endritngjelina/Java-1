package ngjelina4;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program prompts user to input number of tosses 
//The program through methods calculates how many times it falls as tails or heads

//Import Scanner and Random
import java.util.Scanner;
import java.util.Random;
public class Ngjelina4program2 {
	
	public static void main(String[] args) {
		
		//set heads, tails and toss integers to 0
		int heads = 0;
		int tails = 0;
		int toss = 0;
		
		//get Scanner 
		Scanner times = new Scanner(System.in);
		System.out.println("How many times should I toss the coin? ");
		
		//input received from user set as variable toss
		toss = times.nextInt();
		
		//for loop to loop through all tosses
		for ( int i = 0 ; i<toss; i++ ) {	
			
			//if statement if function gets heads
			if (headsortails().equals("heads")) {
				
				//add one to variable heads for each head 
				heads++;
			}
			else {
				//add one to variable tails for any value other than head
				tails++;}
		}
		//output the result of tosses, how many heads or tails
		System.out.println("Results of " + toss + " tosses. ");
		System.out.println("Heads: " + heads + ", tails: " + tails);
		
		//close variable times
		times.close();
	}
	//method for heads or tails
	public static String headsortails() {
		int x = 0;
		
		//get random integer
		Random rand= new Random();
		
		// integer can be 0 or 1
		x = rand.nextInt(2);
		
		//if integer is 1, return heads
		if (x==1) {
			return "heads";}
		
		else {
			//if integer other than 1, return tails
			return "tails";}
	}
}