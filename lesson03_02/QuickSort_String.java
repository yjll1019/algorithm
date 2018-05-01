package lesson03_02;

import java.util.Arrays;

/*
 * 작성일 : 2018년 04월 07일
 * 내 용 : 퀵 정렬(quick Sort)로 String[] 정렬하기.
 */
public class QuickSort_String {

	static void swap(String []s, int i, int j) {
		String temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
	
	static int partition(String[] s, int start, int end) {
		String value = s[end];
		int i=start-1;
				
		for(int j=start; j<=end-1; ++j) { //j=start! j=0으로 하면 무조건 0부터 end-1까지 비교하기 때문에 i가 범위를 넘어 ArrayIndexOutOfBoundsException발생!
			if(s[j].compareTo(value)<0) swap(s, ++i, j);
		}
		swap(s, i+1, end);
		return i+1;
	}
	
	static void quickSort(String[] s, int start, int end) {
		
		if(start>=end) return ;
		int middle = partition(s, start, end);
		quickSort(s, start, middle-1);
		quickSort(s, middle+1, end);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_02_QuickSort_String : 이예지");
		
		String [] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		System.out.println("quickSort정렬 전 : "+Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println("quickSort정렬 후 : "+Arrays.toString(arr));
	}	

}
