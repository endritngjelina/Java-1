package ngjelina5;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program contains an Array List of strings with celebrities
//The list is processed with a for loop 
//The list is passed in a void method 

//Import Iterator and ArrayList
import java.util.ArrayList;
import java.util.Iterator;

public class Ngjelina5program3 {

	public static void main(String[] args) {
		
		//Create Array List
		ArrayList < String > Names = new ArrayList<>();
		
		//Add names
		Names.add("Lionel Messi");
		Names.add("Drake");
		Names.add("Adele");
		Names.add("Dwayne Johnson");
		Names.add("Beyonce");
		
		//Print statement
		System.out.println("Here is the list ");
		
		//For loop for names
		for (int i = 0; i < Names.size(); i++ ) {
			
			//Print the original list
			System.out.println(Names.get(i));
		}
		
		//Output statement
		System.out.println("Using an iterator, here is the list ");
		
		//Call method
		Modifyarraylist(Names);
		
		//Print statement
		System.out.println("Here is the new list ");
		Iterator < String > listiterator = Names.iterator();
		
		//While loop for list iterator 
		while (listiterator.hasNext()) {
			
			//Display method
			System.out.println(listiterator.next());
			}
		}
	public static void Modifyarraylist(ArrayList<String>parameter) {
		
		//Add new parameter
		parameter.add(2,"Taylor Swift");
		
		//Remove parameter
		parameter.remove(4);
		
		for ( String item : parameter ) {
			
			//Print list of items 
			System.out.print(" * " + item);
		}
		System.out.println(" ");
	}
}