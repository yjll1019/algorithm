package lesson03;

import java.util.Arrays;

/*
 * 작성일 : 2018년 03월 24일
 * 내 용 : Comparator인터페이스를 구현한 Person클래스 작성 후 Person배열을 정렬한다.
 */

public class Example1_Person2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("lesson03_Example1_Person2 : 이예지");
		
		Person2 [] p = new Person2[] {		
				new Person2("홍길동", 18),
				new Person2("홍길동", 20),
				new Person2("임꺽정", 22),
				new Person2("전우치", 23)
		};
		
        Arrays.sort(p, new PersonNameComparator());
		System.out.println(Arrays.toString(p));
	
		Arrays.sort(p, new PersonAgeComparator());
		System.out.println(Arrays.toString(p));

	}

}
