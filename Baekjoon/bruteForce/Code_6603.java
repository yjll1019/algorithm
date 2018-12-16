package bruteForce;

import java.util.Scanner;

/*
 * 작성일 : 2018년 12월 16일
 * 내 용 : 로또
 */
public class Code_6603 {
	
	static int n;
	static int[] arr;
	static int[] result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String[] s = sc.nextLine().split(" ");
			
			n = Integer.parseInt(s[0]);
			arr = new int[n];
			result = new int[n];
			
			if(n==0) 
				break;
			
			for(int i=0; i<n; ++i) {
				arr[i] = Integer.parseInt(s[i+1]);
			}
			
			function(0,0);
			System.out.println();
		}
	}
	
	public static void function(int s, int d) {
		if(d==6) {
			for(int i=0; i<n; ++i) {
				if(result[i]==1)
					System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		for(int i=s; i<n; ++i) {
			result[i] = 1;
			function(i+1, d+1);
			result[i] = 0;
		}
	}
}
