package ngjelina7;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program generates 10 random doubles between 1 and 11
//It writes the doubles in a text file, one number per line
//It reads the text file and displays all the doubles and their sum accurate to two decimal places

//Import Random, Scanner, File, FileWriter and IOException
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ngjelina7program2 {

	public static void main(String[] args) {
		
		//Create random value
		Random rand = new Random();
		
		//Create numbers array 
		double [] numbers = new double [10];
		
		//For loop for 10 random values in array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextDouble(10)+1;
			
			//Display array list
			System.out.println(numbers[i]);}
		
		//Try - catch block
		try { 
			FileWriter filewriter = new FileWriter("RandomNumbers.txt");
			
			for (int i = 0; i < numbers.length; i++) {
				filewriter.write(numbers[i]+"d\n");
				}
			
			//Close variable
			filewriter.close();
			
			//Create file
			File file = new File("RandomNumbers.txt");
			
		//Create Scanner
		Scanner scanner = new Scanner(file);
		
		//Create total variable
		double total = 0;
		
		//While loop for Scanner to return true or not
		while (scanner.hasNextLine()) {
			String text = scanner.nextLine();
			
			//Create new line between numbers
			text = text.replace("\n", "");
			
			//Parse double
			double currentnumber = Double.parseDouble(text);
			
			//Add all current numbers to total
			total+= currentnumber;
			}
		
		//Output total rounded up to two decimal points
		System.out.println(String.format("Total is %.2f", total));
		scanner.close();
		}
		//Catch IOExeption IOEx
		catch (IOException IOEx) {
			IOEx.printStackTrace();
		}
	}
}