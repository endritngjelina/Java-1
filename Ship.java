package nngjelina11;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This class contains three instance variables
//It represents a model of a ship with those attributes
//The attributes are the name, the year of creation and if it is afloat or not

	//Ship Class
	public class Ship {
	
			//Create private String
			private String name;
			
			//Create private integer
			private int year;
			
			//Create private boolean
			private boolean afloat;
			
			//Parameterized constructor for the three parameters
			public Ship (String name, int year, boolean afloat) {
				this.name = name;
				this.year = year;
				this.afloat = afloat;
			}
			
			//Method returns name of ship
			public String getName() {
				return name;
			}
			
			//Method returns year the ship was built
			public int getYear() {
				return year;
			}
			
			//Method returns true of false if the ship is afloat of not
			public boolean isAfloat() {
				return afloat;
			}
			
			//This method sets a value to the attribute afloat
			public void setAfloat (boolean afloat) {
				this.afloat = afloat;
			}
			
			@Override
			//Method returns a description of the ship
			public String toString() {
				return("Ship name: "+name+ ", year launched: " + year + ", is afloat: " + afloat);
			}
	}