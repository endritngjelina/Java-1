package nngjelina13;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//Test Autos class contains the main method
//Which is used to test the Automobile class

//Import Array list and Collections
import java.util.ArrayList;
import java.util.Collections;

//Class Test Autos
public class TestAutos {
	
	//Main method 
	public static void main (String[] args) {
		
		//Declare object automobile
		ArrayList<Automobile> automobiles = new ArrayList<>();
		
		//Add new automobile
		automobiles.add(new Automobile("Mazda ","MX-5 Miata",2022,27650));
		automobiles.add(new Automobile("Mercedes-Benz ","G-Class",2018,125000));
		automobiles.add(new Automobile("Volkswagen ","Polo",2000,11000));
		automobiles.add(new Automobile("Toyota ","Corolla",2010,16000));
		automobiles.add(new Automobile("Hyundai ","Elantra",2019,21300));
		
		//Display prompt
		System.out.println("Before sort the data....");
		
		//For loop for automobiles
		for(int i=0; i<automobiles.size(); i++) {
			
			//Display list before sorting
			System.out.println(automobiles.get(i));
		}
		
		//Sort automobiles
		Collections.sort(automobiles);
		
		//Output message
		System.out.println("After sort the data...");
		
		//For each loop to display new list
		for (Automobile a:automobiles) {
			
			//Display new sorted list
			System.out.println(a);
		}
	}
}