package ngjelina4;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program calculates the distance in meters and feet of a falling object
//It does so by using three methods and returning values
public class Ngjelina4program1 {
	 public static void main(String[] args){
	
	 //Display the headings of the columns
     System.out.printf("%3s\t%6s\t%6s\n", "SEC", "METERS", "FEET");
     
     //For loop for the range of time
	 for(int time = 1; time <= 10; time++){
		 
		 //Display time column
		 System.out.print(time + "\t");
		 double distance = meters(time);
		 
		 //Display the distance column
		 System.out.printf("%6.1f\t", distance);
		 
		 //Display the distance in feet column
		 System.out.printf("%6.1f",feet(distance));
		 System.out.println(); 
	    } 
	}
	 //method for distance in meters
	 public static double meters(int time){
	 double meters;
	 
	 //set g as a double
	 double g = 9.8;
	 
	 //calculate distance in meters
	 meters = (.5 * g * Math.pow(time, 2));
	 
	 //return meters value
	 return meters;}
	 
	 //method for distance in feet
	 public static double feet(double distance){
	 double feet = distance * 3.28084 ;
	 
	 //return distance in feet
	 return feet; 
	 }
}
