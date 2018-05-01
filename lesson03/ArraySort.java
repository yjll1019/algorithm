package lesson03;

import java.util.Arrays;

/*
 * 작성일 : 2018년 03월 23일
 * 내 용 : 입력된 정수 배열에서 짝수는 배열의 앞 부분에, 홀수는 배열의 뒷 부분에 위치하게 하는 메소드 구현.
 */
public class ArraySort {
	
	static void sort(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void bubbleSort(int[] a) {
		for(int i=a.length-1; i>=1; --i) {
			for(int j=0; j<i; ++j) {
				if(a[j]%2==1) {
					//홀수면
					sort(a, j, j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("lesson03_ArraySort : 이예지");
		
		int [] a = {1,2,3,4,6,5,10,11,45};
	
		bubbleSort(a);
		
		System.out.print(Arrays.toString(a));
	}

}
