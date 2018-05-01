package lesson03;

import java.util.Arrays;

/*
 * 작성일 : 2018년 03월 24일
 * 내 용 : Comparable인터페이스를 구현한 Person클래스 작성 후 Person배열을 정렬한다.
 */
public class Example1_Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_Example1_Person : 이예지");
		
		Person [] p = new Person[] {		
				new Person("홍길동", 18),
				new Person("홍길동", 20),
				new Person("임꺽정", 22),
				new Person("전우치", 23)
		};
		
		Arrays.sort(p);
		System.out.println(Arrays.toString(p));
	
	}

}
