package nngjelina13;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This class is the mother class of Dog and Reptile class
//It contains methods, the constructor and is tested on the Test Pets class

//Import Date
import java.util.Date;

//Public class pet
public class Pet {
	
	//Data fields
	protected String name;
	protected char gender;
	protected Date acquired;
	
	//Parameterized constructor for the parameters
	public Pet(String name, char gender, Date acquired) {
		this.name= name;
		this.gender= gender;
		this.acquired=acquired;
	}
	
	//Get name
	public String getName() {
		
		//Return name
		return name;
	}
	
	//Get Gender
	public char getGender() {
		
		//Return Gender
		return gender;
	}
	
	//Get Acquired
	public Date getAcquired() {
		
		//Return acquired
		return acquired;
	}
	
	//Sound string
	public String sound() {
		
		//Return null
		return null;
	}
}