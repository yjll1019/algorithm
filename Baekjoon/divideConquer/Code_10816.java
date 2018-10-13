package divideConquer;

import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 12일
 * 내 용 : 숫자 카드2
 */
public class Code_10816 {
	
	static int[] arr=new int[20000001];
	
	public static void binarySearch(int t) {
		if(t==0) {
			System.out.print(arr[t]+" ");
		}else if(1 <= t) {
			System.out.print(arr[t+10000000]+" ");
		}else {
			System.out.print(arr[t+10000001]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n-->0) {
			int t = sc.nextInt();
			
			if(t==0) {
				arr[t] += 1;
			}else if(1 <= t) {
				arr[t+10000000] += 1;
			}else {
				arr[t+10000001] += 1;
			}
		}
		
		int m = sc.nextInt();
		
		while(m-->0) {
			binarySearch(sc.nextInt());
		}
		
	}

}
