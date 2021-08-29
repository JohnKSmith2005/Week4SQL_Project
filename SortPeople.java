package Week4Coding;

import java.util.ArrayList;
import java.util.Comparator;

public class SortPeople {

	// Create a main method to call the sort methods.
	public static void main(String[] args) {
		Dao datasource = new Dao();
		ArrayList<Person> people = datasource.getPeople();
		nameSorterLambda(people);
		// Print the list after sorting
		printArrayList(people);
		System.out.println();
		nameSorterMethodReference(people);
		// Print the list after sorting
		printArrayList(people);

	}

	// In another class, write a method to sort the objects using a Lambda
	// expression using the compare method you created earlier.

	static ArrayList<Person> nameSorterLambda(ArrayList<Person> personList) {
		Comparator<Person> peopleCompare = (person1, person2) -> {
			return Person.compare(person1, person2);
		};
		personList.sort(peopleCompare);
		return personList;

	}

	// Write a method to sort the objects using a Method Reference to the compare
	// method you created earlier.
	static ArrayList<Person> nameSorterMethodReference(ArrayList<Person> personList) {
		personList.sort(Person::compare);
		return personList;
	}

	static void printArrayList(ArrayList<Person> personList) {
		for (Person person : personList) {
			System.out.println(person.getFirstName());
		}
	}
}
