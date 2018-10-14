package divideConquer;

import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 13일
 * 내 용 : 배열 합치기
 */
public class Code_11728 {

	static int[] arr;
	static int[] brr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new int[n+m];
		brr = new int[n+m];
		
		for(int i=0; i<n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=n; i<n+m; ++i) {
			arr[i] = sc.nextInt();
		}
				
		sort(0, arr.length-1);
		
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	public static void sort(int start, int end) {
		if(start>=end)
			return;
		int middle = (start+end)/2;
		sort(start, middle);
		sort(middle+1, end);
		merge(start, end);
	}
	
	public static void merge(int start, int end) {
	
		int middle = (start+end)/2;
		int a = start;
		int b = middle+1;
		int i=0;
		
		while(a<=middle && b<=end) {
			if(arr[a] >= arr[b])
				brr[i++] = arr[b++];
			else
				brr[i++] = arr[a++];
		}
		
		while(a<=middle) {
			brr[i++] = arr[a++];
		}
		
		while(b<=end) {
			brr[i++] = arr[b++];
		}
		
		int z = 0; 
		
		for(int j=start; j<=end; ++j) 
			arr[j] = brr[z++]; //brr은 항상 0부터 채우기 때문에 arr과 인덱스가 다름.
		
	}

}
