package lesson03;

import java.util.Arrays;

/*
 * 작성일 : 2018년 3월 26일
 * 내 용 : String[] 배열 정렬하기, 강의자료 03 연습문제 
 */
public class StringArray {

	static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int findMin(String[] a, int start) {
		int min = start;
		for(int i=start; i<a.length; ++i) {
			if(a[min].compareTo(a[i])>0) //min이 i보다 크면
				min = i; //min은 i
		}
		return min;
	}
	
	static void selectionSort(String[] a) {

		int min=0;
		
		for(int i=0; i<a.length-1; ++i) { 
			min = findMin(a, i); 
			if(min!=i) swap(a, i, min); 
		}
	}
	
	static void bubbleSort(String[] a) {
		for(int i=a.length-1; i>0; --i) {
			for(int j=0; j<i; ++j) {
				if(a[j].compareTo(a[j+1])>0) //j가 j+1보다 크면 
					swap(a, j, j+1);
			}
		}
	}
	
	static void insertionSort(String[] a) {
		for(int i=1; i<a.length; ++i) {
			String value = a[i];
			int j;
			for(j=i-1; j>=0; --j) {
				if(a[j].compareTo(value)>0) //j가 value보다 크면 j를 j+1로 
					a[j+1] = a[j];
				else
					break;
			}
			a[j+1] = value;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_StringArray:이예지");
		
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		Arrays.sort(a);
		System.out.println("Arrays클래스 sort메소드 정렬:"+Arrays.toString(a));
		//Arrays클래스의 sort메소드를 이용해서 String배열을 정렬할 수 있다.
		
		String [] b = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		selectionSort(b);
		System.out.println("selectionSort로 정렬 : "+Arrays.toString(b));
		
		String [] c = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		bubbleSort(c);
		System.out.println("bubbleSort로 정렬 : "+Arrays.toString(c));

		String [] d = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		insertionSort(d);
		System.out.println("insertionSort로 정렬 : "+Arrays.toString(d));
		
	}

}
