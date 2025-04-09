package nngjelina13;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program is a child class of Class Pet
//It contains the required statements, getters and methods for testing. 

//Import Date
import java.util.Date;

//Public Class Dog
public class Dog extends Pet implements Mobility, Comparable<Dog>{
	
	//Establish data fields
	private String breed;
	private int weight;
	
	//Parameterized constructor for the five parameters
	public Dog(String name, char gender, Date acquired, String breed, int weight) {
		super(name,gender,acquired);
		this.breed=breed;
		this.weight=weight;
	}
	
	//Get Breed
	public String getBreed() {
		
		//Return Breed
		return breed;
	}
	
	//Get Weight
	public int getWeight() {
		
		//Return Weight
		return weight;
	}
	
	//String for sound
	public String sound() {
		
		//Return sound
		return "Barks or howls";
	}
	
	//String to string method
	public String toString() {
		
		//Returns String
		return "Dog name ="+name+", "+breed+", "+gender+"\n"+move()+", weight "+weight+"\n"+sound()+", acquired "+acquired;
	}
	
	//Compare method
	public int compareTo(Dog o) {
		if(this.weight<o.weight)
			return -1;
		else if(this.weight>o.weight)
			return 1;
		else
			return 0;
	}
	//Movement
	public String move() {
		
		//Return String
		return "Walks on leash";
	}
}