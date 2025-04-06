package ngjelina3;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program displays the multiples of 11 or 13 between 300 and 200 inclusive, in a decreasing order.
//The multiples can not be of both 11 and 13, and they are left aligned 8 characters wide.
//There are 5 multiples for each line.
public class Ngjelina3program1 {
	
	public static void main(String[] args) {
		
		//variable for number
		int number = 300;
		
		//variable for line count
		int line_count = 1;
		
		//create found variable and set it to 0
		int found = 0;
		
		//create total variable and set it to 0
		int total = 0;
		
		//Create while loop for the multiples of 11 or 13 between 300 and 200 inclusive
		while(number>= 200 && number <= 300) {
			
			//create if statement so that a multiples of 11 and 13
			if((number % 11 == 0) != (number%13==0)) {
				
				//nest a if - else block to display if there are five integers per line
				if (line_count == 5) {
				System.out.println(number ); 
				line_count = 1;
				
				}else {
					//Display integers 8 characters wide and left aligned
					System.out.print(String.format("%-8d", number));
					line_count++;
				}
				//increase found for each new multiple
				found ++;
				total += number;
			}
			number = number -1;
		}
		//display how many multiples were found and their sum
		System.out.println("Found " + found + " integers totaling " + total);
	}
}
