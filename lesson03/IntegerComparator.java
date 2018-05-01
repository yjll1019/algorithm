package lesson03;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer i1, Integer i2) {
		return i2.compareTo(i1);
	}
	
}
