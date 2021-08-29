package Week4Coding;

import java.util.ArrayList;
import java.util.List;

public class Dao {


	
//Create a static list of these objects, adding at least 4 objects to the list.

		static ArrayList<Person> people = new ArrayList<>(List.of(new Person("John"), new Person("Erik"), new Person("Tim"), new Person("Jeff"),
				new Person("Alex"), new Person("Ted"), new Person("Alfred"), new Person("Jason"), new Person("Tiffany"),
				new Person("Jorge")));
		
	//created a database with people
		
		public ArrayList<Person> getPeople() {
			return people;
			
			//returns a list of people
		
	

}
}
