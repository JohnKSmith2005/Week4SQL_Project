package Week4Coding;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		// Create a Stream from the list of objects.
		Dao datasource = new Dao();
		ArrayList<Person> people = datasource.getPeople();
		java.util.stream.Stream<Person> streamPeople = people.stream();
		// Turn the Stream of object to a Stream of String (use the map method for
		// this).
		java.util.stream.Stream<String> peopleStreamAsStrings = streamPeople.map(person -> person.toString());

		// Sort the Stream in the natural order. (Note: The String class implements the
		// Comparable
		// interface, so you won't have to supply a Comparator to do the sorting.)
		peopleStreamAsStrings = peopleStreamAsStrings.sorted();
		// Create a collector that tells Java how to separate the strings once combined
		Collector<CharSequence, ?, String> seperation = Collectors.joining(", ");
		String collectedString = peopleStreamAsStrings.collect(seperation);
		// Print the resulting String.
		System.out.println(collectedString);
	}
}
