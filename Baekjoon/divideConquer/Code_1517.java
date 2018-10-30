package divideConquer;

import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 29일
 * 내 용 : 버블 소트
 */
public class Code_1517 {
	
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new int[n];
		
		for(int i=0; i<n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(sort(0, n-1));
	
	}
	
	static public long sort(int s, int e) {
		if(s==e)
			return 0;
		
		int m = (s+e)/2;

		long ans = sort(s,m) + sort(m+1,e);
		
		int a = s;
		int b = m+1;
		int i = 0;
		
		int[] brr = new int[e-s+1];
		
		
		while(a<=m || b<=e) { //원소가 하나가 남을 때까지 while문이 반복되어야하기 때문에 or연산자 
			if (a <= m && (b > e || arr[a] <= arr[b])) { //오른쪽 영역이 다 정렬된 후 왼쪽 정렬도 배열에 넣어주기 위해서 b<e 추가
				brr[i++] = arr[a++];
			}else {
				ans+=(long) m-a+1;
				brr[i++] = arr[b++];
			}
		}

		for(int j=s; j<=e; ++j) {
			arr[j] = brr[j-s];
		}
		
		return ans;
	}
}
