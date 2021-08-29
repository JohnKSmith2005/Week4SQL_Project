package Week4Coding;

import java.util.NoSuchElementException;
import java.util.Optional;

public class CheckOptional {
	// Create a new class with a main method. Create a method (method a) that
	// accepts an Optional of some type of object (Animal, Person, Camera, etc.).

	// The method should return the object unwrapped from the Optional if the object
	// is present. For example, if you have an object of type Cheese, your method
	// signature should look something like this:

	public static void main(String[] args) {
		Person testPerson = new Person("Jorge");
		Optional<Person> optionalTestPerson = Optional.of(testPerson);
		unwrapPerson(optionalTestPerson);
		checkPerson(testPerson);
	}

	public static Person unwrapPerson(Optional<Person> person) throws NoSuchElementException {

		if (person.isPresent()) {
			return person.get();
		} else {
			// The method should throw a NoSuchElementException with a custom message if the
			// object is not present.
			throw new NoSuchElementException("Optional person was given, but did not contain a person");
		}

	}

	// Create another method (method b) that calls method a with an object wrapped
	// by an Optional.
	// Show that the object is returned unwrapped from the Optional (i.e., print the
	// object).

	public static void checkPerson(Person person) {

		Optional<Person> Optperson = Optional.ofNullable(person);
		Person unwrappedPerson = unwrapPerson(Optperson);
		System.out.println(unwrappedPerson);
		Optional<Person> EmptyPerson = Optional.empty();

//		Method b should also call method a with
//		an empty Optional. Show that a NoSuchElementException
//		is thrown by method a by printing the exception message. 
//		Hint: catch the NoSuchElementException as parameter named
//		"e" and do System.out.println(e.getMessage()).

		System.out.println(Optperson.orElseThrow());
		System.out.println(EmptyPerson.orElseThrow( () -> new NoSuchElementException("Optional person was given, but did not contain person (Method used: checkPerson)")));

	}

}
