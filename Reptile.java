package nngjelina13;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This class is a child of the Pet Class
//Java.util.Date is imported 
//It contains the necessary values and methods which are tested in another class

//Import Date
import java.util.Date;

//Public Class Reptile
public class Reptile extends Pet implements Mobility{
	
	//Assert data field type
	private String type;
	
	//Parameterized constructor for the four parameters
	public Reptile(String name, char gender, Date acquired, String type) {
		super(name,gender,acquired);
		this.type=type;
	}
	
	//Movement String
	public String move() {
		
		//Return statement
		return"Must be caged, crawls or slithers";
	}
	
	//Sound
	public String sound() {
		
		//Return Sound
		return"not much sound, maybe a hiss";
	}
	
	//String to string method
	public String toString() {
		
		//Return String
		return "Reptile name = "+name+", "+type+", "+gender+"\n"+move()+"\n"+sound()+", acquired "+acquired; 
	}
}
