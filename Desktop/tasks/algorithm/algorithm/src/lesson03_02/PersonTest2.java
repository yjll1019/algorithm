package lesson03_02;

import java.util.Arrays;
/*
 * 작성일 : 2018년 04월 07일
 * 내 용 : 퀵 정렬(quick Sort)로 Person[] 정렬하기.
 */
public class PersonTest2 {
	static void swap(Person []s, int i, int j) {
		Person temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
	
	static int partition(Person[] s, int start, int end) {
		Person value = s[end];
		int i=start-1;
				
		for(int j=start; j<=end-1; ++j) {
			if(s[j].name.compareTo(value.name)<0) swap(s, ++i, j);
		}
		swap(s, i+1, end);
		return i+1;
	}
	
	static void quickSort(Person[] s, int start, int end) {
		
		if(start>=end) return ;
		int middle = partition(s, start, end);
		quickSort(s, start, middle-1);
		quickSort(s, middle+1, end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_02_PersonTest2 : 이예지");

		Person[] p = new Person[] { 
				new Person("홍길동", 18), 
				new Person("홍길동", 20), 
				new Person("임꺽정", 22),
				new Person("전우치", 23) 
				};
		System.out.println("quickSort정렬 전 : "+Arrays.toString(p));
		quickSort(p, 0, p.length-1);
		System.out.println("quickSort정렬 후 : "+Arrays.toString(p));
	}

}
