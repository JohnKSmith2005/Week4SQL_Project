package Week4Coding;

//create a class of whatever type you want
public class Person {

	// add a name instance variable so that you can tell the objects apart
	private String firstName;

//add getters, setters, and/or a constructor
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

//add constructor
	public Person(String name) {
		this.firstName = name;
	}

	// add a toString method that returns the name and object type


	public String toString() {
		return firstName;
	}

//Create a static method named compare in the class that returns an int and takes two of the objects as parameters.
//Return -1 if parameter 1 is "less than" parameter 2. Return 1 if parameter 1 is "greater than" parameter 2. 
//Return 0 if the two parameters are "equal".

	public static int compare(Person p1, Person p2) {
		return p1.firstName.compareTo(p2.firstName);

		// telling java how to compare two names, if person1 first name is less than
		// person2's name, will return a negative number, else return a positive. Equal
		// names will return 0.
	}

}
