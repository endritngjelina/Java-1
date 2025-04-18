package nngjelina19;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program contains a static and a main method
//It displays an integer list, a double list and a byte list
//And their sums

//import array list
import java.util.ArrayList;				

public class Part2 {

	//main method
	public static void main(String[] args) {
	
	ArrayList<Integer> list1 = new ArrayList<Integer>();		//integer list 1 
		list1.add(12);		//add integer
		list1.add(21);		
		list1.add(7);		
		list1.add(16);		
		list1.add(8);		
		list1.add(13);		
		System.out.println(list1);		//display list
		System.out.println("Integer list totals "+listAdder(list1)); //display the sum for integers
	
	ArrayList<Double> list2 = new ArrayList<Double>();   		//double list
		list2.add(1.1);		//add doubles
		list2.add(2.2);
		list2.add(3.3);
		list2.add(4.4);
		list2.add(5.5);
		list2.add(6.6);	
		System.out.println(list2);		//display list
		System.out.println("Double list totals "+listAdder(list2));	//display the sum for doubles
	
	ArrayList<Byte> list3 = new ArrayList<Byte>();		//byte list
		list3.add((byte)12);	//add bytes
		list3.add((byte)20);
		list3.add((byte)4);
		list3.add((byte)7);
		System.out.println(list3);		//display list
		System.out.println("Byte list totals "+listAdder(list3));	//display the sum for bytes
		
	}
	
	public static double listAdder(ArrayList<? extends Number> list) { 		//the listAdder method
	    double sum = 0;														//set double sum to 0
	    for(int i=0;i<list.size();i++) {									//for loop
	    sum= sum + list.get(i).doubleValue();								//returns the value of a number as a double
	    }
	    return sum;															//return sum
	}
}
