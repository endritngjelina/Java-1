package nngjelina20;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone

//This program contains class Employee which is tested in another program
//It contains private attributes like id, last name, first name and salary
//All the getters and a to String method

//Import java decimal format and number format
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Employee { // Class employee

	private String id, lastName, firstName; // Private string attributes
	private int salary; // Private integer attribute

	// Parameterized constructor for initializing new Employee instance
	public Employee(String id, String lastName, String firstName, int salary) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
	}

	public String getId() { // Getter for Id
		return id;
	}

	public String getLastName() { // Getter for last name
		return lastName;
	}

	public String getFirstName() { // Getter for first name
		return firstName;
	}

	public int getSalary() { // Getter for salary
		return salary;
	}

	@Override
	// to String method to display an Employee's attributes
	public String toString() {

		NumberFormat nfm = NumberFormat.getCurrencyInstance(); // Currency instance for dollar sign
		String pt = ((DecimalFormat) nfm).toPattern();
		String npt = pt.replace("\u00A4", "").trim();
		NumberFormat nfm2 = new DecimalFormat(npt);
		nfm2.setMinimumFractionDigits(0);

		// Return statement
		return "ID " + id + ":" + lastName + ", " + firstName + ", salary $" + nfm2.format(salary);
	}
}