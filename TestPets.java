package nngjelina13;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This class tests the Pet class and its child classes
//It does so from the main method
//This program contains an array for dogs, the reptile data and the current time

//Import Arrays, Calendar and Date
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

//Test Pets class
public class TestPets {
	
	//Main method
	public static void main(String[] args) {
		
		//Assign the current time to date
		Date date = Calendar.getInstance().getTime();
		
		//Assign values to Reptile
		Reptile reptile = new Reptile("Slinky",'M',date,"rock python");
		
		//Display reptile
		System.out.println(reptile);
		System.out.println();
		
		//Array for dogs
		Dog[] dogs = new Dog[4];
		
		//Assign values and data to each dog
		dogs[0]= new Dog("Pedro",'M',date,"chihuahua",14);
		dogs [1]= new Dog("Marley",'M',date,"pug",20);
		dogs[2]= new Dog("Sacha",'F',date,"beagle",25);
		dogs[3]= new Dog("Butch",'M', date, "Alsatian",90);
		
		//Sort dog array
		Arrays.sort(dogs);
		
		//For each loop 
		for(Dog d:dogs) {
			
			//Display dogs
			System.out.println(d);
		}
	}
}