package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 작성일 : 2018년 11월 04일
 * 내 용 : 이분 탐색 - 나무 자르기
 */
public class Code_2805 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //나무의 개수
		int m = sc.nextInt(); //집에 가져가는 나무의 길이
		
		long[] arr = new long[n];
		
		for(int i=0; i<n; ++i)
			arr[i] = sc.nextInt();
		
		Arrays.parallelSort(arr);
		
		//나무들의 길이 중 가장 작은 값과 가장 큰 값
		long startValue = 0; 
		long endValue = arr[n-1];	
		long result = 0;

		while(startValue <= endValue) {
			long middleValue  = (startValue+endValue)/2;
			long m2 = 0;
			
			for(int i=0; i<arr.length; ++i) {
				if(arr[i]>middleValue) {
					m2 += arr[i]-middleValue;
				}
			}
			
			if(m2>=m) {
				result = Math.max(result, middleValue);
				startValue=middleValue+1;
			}else {
				endValue=middleValue-1;
			}
		}
		
		System.out.println(result);
		
	}
	 
}
