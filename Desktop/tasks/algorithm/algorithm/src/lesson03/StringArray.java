package lesson03;

import java.util.Arrays;

/*
 * 작성일 : 2018년 3월 26일
 * 내 용 : String[] 배열 정렬하기
 */
public class StringArray {

	static void swap(String[] a, int i, int j) {
		//배열 a에서 a[i]와 a[j]의 값을 바꿔주는 메소드 swap
		//O(1)
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int findMin(String[] a, int start) {
		//배열 a[start]에서 부터 끝까지 원소 중 가장 작은 값의 위치(인덱스)를 리턴하는 메소드 findMin
		//앞에서부터 시작해 최솟값을 찾음.
		
		int min = start;
		for(int i=start; i<a.length; ++i) {
			if(a[min].compareTo(a[i])>0)
				min = i;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_StringArray:이예지");
		
		String [] a = {"god","desk","apple","home"};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
