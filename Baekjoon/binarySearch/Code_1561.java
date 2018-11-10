package binarySearch;

import java.util.Scanner;

/*
 * 작성일 : 2018년 11월 10일
 * 내 용 : 이분 탐색 - 놀이 공원
 */
public class Code_1561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //N명의 아이들
		int m = sc.nextInt(); //M개의 놀이기구 개수
		
		int[] arr = new int[m]; //놀이기구의 운행 시간을 나타내는 배열
		
		for(int i=0; i<arr.length; ++i)
			arr[i] = sc.nextInt(); //놀이기구의 운행 시간 입력
		
		if(n <= m) {
			System.out.println(n);
			return;
		}
		
		long leftTime = 0;
		long rightTime =  2000000000L * 1000000L; 
		
		while(leftTime<=rightTime) {
			long midTime = (rightTime+leftTime)/2;
			
			long minN = 0; //midTime에 놀이기구를 탄 학생 수 (최소)
			long maxN = m; //midTime에 놀이기구를 탄 학생 수 (최대)

			for(int i=0; i<arr.length; ++i) {
				maxN += (midTime/arr[i]);
				if(midTime%(arr[i])==0) {
					minN--;
				}
			}
			
			minN += maxN+1;
			
			if(n<minN) {
				rightTime = midTime-1;
			}else if(maxN<n) {
				leftTime = midTime+1;
			}else { //n이 minN과 maxN사이인 경우
				for(int i=0; i<arr.length; ++i) {
					if(midTime % arr[i]==0) {
						if(n == minN) {
							System.out.println(i+1);
							return;
						}else {
							minN++;
						}
					}
				}
			}
		}
		
	}

}
