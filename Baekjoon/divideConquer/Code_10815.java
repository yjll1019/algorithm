package divideConquer;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 12일
 * 내 용 : 숫자 카드
 */
public class Code_10815 {
	
	static int[] arr;
	
	public static boolean binarySearch(int n) {
		int start = 0;
		int end = arr.length-1;
		int middle;
		boolean result = false;
		
		while(start<=end) {
			middle = start+(end-start)/2;
			if(arr[middle]==n) {
				result = true;
				break;
			}else if(n <= arr[middle]) {
				end = middle - 1;
			}else {
				start = middle + 1;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new int[n];
		
		for(int i=0; i<n; ++i)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		
		while(m-->0) {
			if(binarySearch(sc.nextInt())) 
				System.out.print(1+" ");
			else
				System.out.print(0+" ");
		}
	}

}
