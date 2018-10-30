package divideConquer;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 10�� 29��
 * �� �� : ���� ��Ʈ
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
		
		
		while(a<=m || b<=e) { //���Ұ� �ϳ��� ���� ������ while���� �ݺ��Ǿ���ϱ� ������ or������ 
			if (a <= m && (b > e || arr[a] <= arr[b])) { //������ ������ �� ���ĵ� �� ���� ���ĵ� �迭�� �־��ֱ� ���ؼ� b<e �߰�
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
