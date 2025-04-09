package nngjelina11;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This class is a child of the Ship class
//It inherits the attributes of the Ship class
//It also has its own attributes, passenger and zone 

//Cruise Ship class
public class CruiseShip extends Ship{
	
	//Create private integer for passengers
	private int passengers;
	
	//Create private string for zone
	private String zone;
	
	//Parameterized constructor for five parameters
	public CruiseShip (String name, int year, boolean afloat, int passengers, String zone) {
		super(name, year, afloat);
		this.passengers = passengers;
		this.zone = zone;
	}
	
	//This method returns the number of passengers
	public int getPassengers() {
		return passengers;
	}
	
	//Method returns zone of Ship
	public String getZone() {
		return zone;
	}
	
	@Override
	
	//Method returns a description of the Cruise Ship
	public String toString() {
		return(super.toString() + "\n" +
				passengers + " passenger capacity, operating in the " + zone);
	}
}