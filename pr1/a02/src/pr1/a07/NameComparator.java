package pr1.a07;
import java.util.Comparator;

import pr1.a06.Person;

public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getNachname().compareTo(o2.getNachname());
	}
}