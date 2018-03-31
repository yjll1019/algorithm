package lesson03;

import java.util.Arrays;

/*
 * 작성일 : 2018년 03월 31일
 * 내 용 : 배열 정렬 시 매개변수를 Comparable [] 로 두기
 */
public class Prac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_Prac3 : 이예지");
		
		//정렬 메소드의 파라미터를 Comparable[] 로 정하면 파라미터의 타입마다 정렬 메소드를 구현하지 않고, Comparable를 구현한 모든 클래스는 파라미터 값으로 들어갈 수 있기 때문에 편리하다.
		
		Integer[] a = {1,5,3,88,70,100,56};
		selectionSort(a);
		System.out.println("Integer 정렬 : "+Arrays.toString(a));
		
		Double [] b =  { 17.1, 14.3, 11.2, 19.5, 11.3, 14.1, 17.5, 19.2 };
		selectionSort(b);
		System.out.println("Double 정렬 : "+Arrays.toString(b));
		
		String [] c = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		selectionSort(c);
		System.out.println("String 정렬 : "+Arrays.toString(c));
		
	}
	
	static void swap(Comparable[] a, int i, int j) {
		//배열 a에서 a[i]와 a[j]의 값을 바꿔주는 메소드 swap
		//O(1)
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int findMin(Comparable[] a, int start) {
		//배열 a[start]에서 부터 끝까지 원소 중 가장 작은 값의 위치(인덱스)를 리턴하는 메소드 findMin
		//앞에서부터 시작해 최솟값을 찾음.
		
		int min = start;
		for(int i=start; i<a.length; ++i) {
			if(a[min].compareTo(a[i])>0) //min이 i보다 크면
				min = i; //min은 i
		}
		return min;
	}
	
	static void selectionSort(Comparable[] a) {

		int min=0;
		
		for(int i=0; i<a.length-1; ++i) { 
			min = findMin(a, i); 
			if(min!=i) swap(a, i, min); 
		}
	}
}
