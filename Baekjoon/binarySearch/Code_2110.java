package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 작성일 : 2018년 11월 04일
 * 내 용 : 이분 탐색 - 공유기 설치
 * 		1. x만큼 공유기 설치가 가능한지 확인한다.
 * 			1-1. 가능하다면 x(공유기 사이의 거리)을 증가
 * 			1-2. 불가능하다면 x(공유기 사이의 거리)를 감소
 * 		2. 조건을 만족하는 (공유기 설치가 가능한 거리) x 값들 중 최대값 출력
 */
public class Code_2110 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //집의 개수
		int c = sc.nextInt(); //공유기 개수
		
		long[] arr = new long[n];
		
		for(int i=0; i<n; ++i)
			arr[i] = sc.nextInt(); //집의 좌표 입력
		
		Arrays.parallelSort(arr);
		
		long startValue = arr[0];
		long endValue = arr[n-1];
		long result = 0;
		
		while(startValue<=endValue) {
			long middleValue = (startValue+endValue)/2; //공유기를 설치할 길이
			long cCount = 1; //설치된 공유기 개수
			long cPosition = arr[0]; //현재 가장 가깝게 설치된 공유기 위치
			
			for(int i=1; i<arr.length; ++i) {
				if(arr[i]-cPosition>=middleValue) {
					cCount++;
					cPosition = arr[i];
				}
			}
			
			if(cCount<c) { //middleValue에 의해 설치한 공유기 개수가 적을 때 >> middleValue값 감소
				endValue = middleValue-1;
			}else {
				if(middleValue > result) //middleValue에 의해 설치한 공유기 개수가 많거나 같을 때 >> middleValue값 증가 
					result = middleValue;
				startValue = middleValue+1;
			}
			
		}
		
		System.out.println(result);
	}
	 
}
