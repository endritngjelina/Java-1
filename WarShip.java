package nngjelina11;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This class is a child of the Ship class
//It inherits the attributes of the Ship class
//It also has its own attributes, type and nation

//War Ship class
public class WarShip extends Ship{
	
	//Create private String for type and nation
	private String type, nation;
	
	//Parameterized constructor for five parameters
	public WarShip(String name, int year,boolean afloat, String type, String nation) {
		super(name, year, afloat);
		this.type= type;
		this.nation= nation;
	}
	
	@Override
	
	//Method returns a description of the War Ship
	public String toString() {
		return(super.toString()+ "\nType: " + type + ", operated by " + nation);
	}
}