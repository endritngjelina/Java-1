package nngjelina11;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//The Ship Test class contains the main method 
//which is used to test the ship class and all of its child classes

//Import Arrays and Array List 
import java.util.ArrayList;
import java.util.Arrays;

//Ship Test Class
public class ShipTest{
	
	//Main method
	public static void main ( String[] args) {
		
		//Declared type Ship but actual type cruise ship
		Ship cruiseShip1 = new CruiseShip("Magic ", 1998, true, 2700 , " Caribbean ");
		Ship cruiseShip2 = new CruiseShip("Titanic ",1912, false, 1300 , " Atlantic Ocean ");
		
		//Declared type Ship but actual type cargo ship
		Ship cargoShip1 = new CargoShip("El Faro ", 1974, false, "containers", 391);
		
		//Declared type Cargo Ship but actual type Cargo ship
		CargoShip cargoShip2 = new CargoShip(" Seawise Giant ", 1979, false, "crude oil", 564763);
		
		//Declared type War Ship but actual type War ship
		WarShip warShip = new WarShip("USS Nimitz ", 1972, true, "super carrier", "Uited States Navy");
		
		//Create array for 5 Ships
		Ship fleet[] = new Ship[5];
		fleet[0]= cruiseShip1;
		fleet[1]=cruiseShip2;
		fleet[2]=cargoShip1;
		fleet[3]=cargoShip2;
		fleet[4]=warShip;
		
		//Display message
		System.out.println("AN ARRAY OF SHIPS IN MAIN");
		
		//For loop to display all Ships in main
		for( int i = 0; i<fleet.length; i++)
			
			//Print Ships
			System.out.println(fleet[i]);
		
		//Create array of type Ship from fleet array
		ArrayList<Ship> fleetList = new ArrayList<Ship>(Arrays.asList(fleet));
		
		//Pass array list to method that return integer variable
		int shipsSank = shipShow(fleetList);
		
		//Display how many Ships sank
		System.out.println(shipsSank + " of these ships sank!");
	}
	
	//Method for new Fleet
	private static int shipShow(ArrayList<Ship> fleetList) {
		
		//Create count variable
		int count = 0;
		
		//Remove Ship from index 2
		fleetList.remove(2);
		
		//Add new Ship to list
		fleetList.add(new WarShip("USS John Warner", 2015, true, "attack submarine", "United States Navy"));
		
		//Output message
		System.out.println("ARRAYLIST OF SHIPS FROM A METHOD");
		
		//For each loop for Ships in new list
		for(Ship ship : fleetList) {
			
			//Display Ships of the new fleet
			System.out.println(ship);
		}
		//For each loop
		for(Ship ship: fleetList) {
			
			//If statement for Ships that are afloat
			if(!ship.isAfloat())
				count++;
		}
		//Return statement
		return count;
	}
}