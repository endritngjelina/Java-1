package nngjelina13;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program contains the Automobile class
//It contains the data fields, getters and method that is tested in Test Autos class

//Import Number Format
import java.text.NumberFormat;

//Public Class Automobile
public class Automobile implements Comparable<Automobile>{
	
	//Establish data fields
	private String make,model;
	private int year;
	private double price;
	
	//Parameterized constructor with four parameters 
	public Automobile(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	//Get Model 
	public String getModel() {
		
		//Return model
		return model;
	}
	
	//Get year
	public int getYear() {
		
		//Return year
		return year;
	}
	
	//Get price
	public double getPrice() {
		
		//Return price
		return price;
	}
	
	//Get make
	public String getMake() {
		
		//Return make
		return make;
	}
	
	//Convert object to string readable format
	
	@Override
	
	public String toString(){
		
		//Format the currency 
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		//Return statement
		return "Make: "+make+" Model: "+model+" Year: "+year+" Price: "+formatter.format(price);
	}
	
	@Override
	//Compare to method 
	public int compareTo(Automobile o) {
		if(this.year<o.year)
			return -1;
		else if(this.year>o.year)
			return 1;
		else
			return 0;
	}
}