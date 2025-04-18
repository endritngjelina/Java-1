package nngjelina20;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone

//This program tests class Employee
//It contains an array for the 8 employees, a linked list  
//And an iterator to iterate through forwards and backwards

//Import the required packages.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main { // main class

	public static void main(String[] args) { // main method

		// Create an employee array.
		Employee[] eArr = new Employee[8];
		eArr[0] = new Employee("23232", "Baker", "Amy", 100000);
		eArr[1] = new Employee("56789", "Jones", "Dan", 130000);
		eArr[2] = new Employee("13579", "Jones", "Pat", 80000);
		eArr[3] = new Employee("67765", "Jones", "Don", 140000);
		eArr[4] = new Employee("12345", "Baker", "Tom", 200000);
		eArr[5] = new Employee("45454", "Perez", "Ava", 105000);
		eArr[6] = new Employee("24680", "Scott", "Ann", 90000);
		eArr[7] = new Employee("11111", "Scott", "Bob", 65000);

		// Create the array list from the employee array.
		ArrayList<Employee> eArlist = new ArrayList<>(Arrays.asList(eArr));
		System.out.println("Staff Alpha sorted by names\n");

		// Create the comparator to sort the array list by last name.
		Comparator<Employee> lastName = new Comparator<Employee>() {

			@Override
			public int compare(Employee i, Employee j) {
				int r = i.getLastName().compareToIgnoreCase(j.getLastName());
				if (r != 0)
					return r;
				return i.getLastName().compareToIgnoreCase(j.getLastName());
			}
		};

		// Create the comparator to sort the array list by first name.
		Comparator<Employee> firstName = new Comparator<Employee>() {
			@Override
			public int compare(Employee i, Employee j) {
				int r = i.getFirstName().compareToIgnoreCase(j.getFirstName());
				if (r != 0)
					return r;
				return i.getFirstName().compareToIgnoreCase(j.getFirstName());
			}
		};

		// Sort the array list by last name and then by first name.
		Collections.sort(eArlist, lastName.thenComparing(firstName));

		// Use lambda with for each to print the array list.
		eArlist.forEach(i -> System.out.println(i));

		System.out.println();

		// Create a link list from the array list.
		LinkedList<Employee> llist = new LinkedList<>(eArlist);

		// Create an iterator for the linked list.
		ListIterator<Employee> liter = llist.listIterator();

		// Iterate forward without printing.
		while (liter.hasNext()) {
			liter.next();
		}

		// Display the message.
		System.out.println("Staff sorted Reverse Alpha\n");

		// Iterate backwards and print the list content.
		while (liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
	}
}