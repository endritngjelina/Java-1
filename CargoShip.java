package nngjelina11;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This class is a child of the Ship class
//It inherits the attributes of the Ship class
//It also has its own attributes, cargo and capacity
public class CargoShip extends Ship{
	
	//Create private string for cargo
	private String cargo;
	
	//Create private integer for capacity
	private int capacity;

	//Parameterized constructor for five parameters
	public CargoShip (String name, int year, boolean afloat, String cargo, int capacity) {
		super(name, year, afloat);
		this.cargo=cargo;
		this.capacity=capacity;
	}
	
	//Method returns capacity
	public int getCapacity() { 
		return capacity;
	}
	
	@Override
	
	//Method returns a description of Cargo Ship
	public String toString() {return (super.toString()+ "\nCapacity of " + cargo + " is " + capacity);
	}
}