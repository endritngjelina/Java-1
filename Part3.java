package nngjelina19;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program generates 10 random integers and displays them
//The list is sorted from smallest to biggest
//It prints the biggest value, which was returned from the method
//Random integers are form 0 to 100

//import Arrays and Random
import java.util.Arrays;
import java.util.Random;

//class part 3
public class Part3 {
	
	//main method
	public static void main(String[] args) {
		
		Integer list[] = new Integer[10];		//new array
		Random value = new Random();			//random value

		for ( int i=0; i < 10; i++) {			//assign value with for loop
		list [i] = value.nextInt(101);
		}
		
		Arrays.sort(list);						//arrays sort list
		
		for ( int i = 0; i < 10; i++) {			//for loop for commas
			if (i==9) {
				System.out.print(list[i] + " ");
			}
			else {
				System.out.print(list[i] + ", ");
			}
		}
		
		System.out.println(" ");
		System.out.println("Max = " + max(list));	//display max value
	}
	
	public static <E extends Comparable<E>> E max(E[] list) {

        E max = list[0];							//establish array
        for (int i = 1; i < list.length; i++) {		//for loop
            E element = list[i];
            if (element.compareTo(max) > 0) {		//compare elements
                max = element;
            }
        }
        return max;									//return max
    }
}