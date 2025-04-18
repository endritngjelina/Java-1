package nngjelina19;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program contains a static method that takes a generic array as argument.
//The method displays the array and returns the number of elements

//Class Part1
public class Part1 {
    public static void main(String[] args)     {      //main method
    	Integer arr[] = {12,21,7,16,8,13}; 				//integer array
    	
    	System.out.print("Here is an Integer array \n");  //display message
    	int size;         									
    	size = displayArray(arr);         //call method for integer array
    	System.out.println("That array held "+size+" elements");    //number of elements for integer array
    	        
    	String arr1[] = {"one","two","three","four"};         //string array
    	System.out.print("Here is an String array \n");         //display message
    	size = displayArray(arr1);         						//call method for string array
    	System.out.println("That array held "+size+" elements");//number of elements in array    
    	     
    	Double arr2[] = {1.1,2.2,3.3,4.4,5.5};         		//double array
    	System.out.print("Here is an Double array \n");     //display message     
    	size = displayArray(arr2);							//call method for double array         
    	System.out.println("That array held "+size+" elements");     }   //display number of elements
    
    private static<T> int displayArray(T[] array )     {    //generic method   
    	for (int i = 0; i < array.length; i++) {      		//for loop       
    		System.out.print(array[i]+" ");         		//display array
    		}        
    	System.out.println();        
    	return array.length;     							//return length
    }
}