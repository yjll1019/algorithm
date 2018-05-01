package lesson03;

import java.util.Arrays;

/*
 * 작성일 : 2018년 03월 23일
 * 내 용 : 이미 정렬이 다 된 상태면 반복문을 종료시키는 개선된 버블 정렬(bubble sort) 구현.
 */
public class Example2_bubbleSort {

	static void swap(int[] a, int i, int j) {
		//O(n)
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void bubbleSort(int[] a) {
		//O(n^2)
		for(int i=a.length-1; i>=1; --i) {
			boolean result = true;
			//밖에다가 result = true로 하게 되면 i값을 바꿀 때 마다 true가 되지 않기때문에 안에다가 써줘야한다!
			for(int j=0; j<i; ++j) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
					result = false;
				}
			}
			if(result) break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lesson03_Example2_bubbleSort : 이예지");
		
        int[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };

        bubbleSort(a);//O(n^2)
        System.out.println(Arrays.toString(a));
		
	}

}
