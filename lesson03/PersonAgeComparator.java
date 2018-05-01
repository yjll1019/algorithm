package lesson03;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person2>{
	
	@Override
	public int compare(Person2 p1, Person2 p2) {
		int r = p1.age-p2.age;
		if(r!=0) return r;
		return p1.name.compareTo(p2.name);
	}
}
