package lesson03;

import java.util.Arrays;

/*
 * 작성일 : 2018년 03월 24일
 * 내 용 : Comparator인터페이스를 구현하여 Integer배열을 내림차순으로 정렬.
 */
public class IntegerDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_IntegerDescending : 이예지");
		
		Integer [] a = new Integer[] {19,10,11,4,70,8,100};
		//Integer [] a = {19,10,11,4,70,8,100};
		
		Arrays.sort(a, new IntegerComparator());
		System.out.println(Arrays.toString(a));
	}

}
