package lesson03_02;
/*
 * 작성일 : 2018년 04월 07일
 * 내 용 : 퀵 정렬(quickSort)로 String[]을 정렬하되, 기준값을 선두로 정해서 정렬하기.(강의자료 중 알고리즘 구상훈련)
 */
import java.util.Arrays;

public class Reverse_QuickSort {
	static void swap(String []s, int i, int j) {
		String temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
	
	static int partition(String[] s, int start, int end) {
		String value = s[start];
		int i=start;
				
		for(int j=start+1; j<=end; ++j) {
			if(s[j].compareTo(value)<0) swap(s, ++i, j);
		}
		swap(s, i, start);
		return i;
	}
	
	static void quickSort(String[] s, int start, int end) {
		
		if(start>=end) return ;
		int middle = partition(s, start, end);
		quickSort(s, start, middle-1);
		quickSort(s, middle+1, end);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_02_Reverse_QuickSort : 이예지");
		
		String [] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		System.out.println("quickSort정렬 전 : "+Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println("quickSort정렬 후 : "+Arrays.toString(arr));
	}	

}
