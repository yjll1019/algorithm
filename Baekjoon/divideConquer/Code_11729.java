package divideConquer;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 10�� 14��
 * �� �� : �ϳ��� ž �̵� ����
 */
public class Code_11729 {

	static int cnt=0;
	static StringBuffer sb;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		sb = new StringBuffer();
		
		function(n, 1, 3);
	
		System.out.println(cnt); // == (1<<n)-1;
		System.out.println(sb);
	}
	
	
	public static void function(int n, int a, int b) {
		if(n==0)
			return;
		cnt++;
		function(n-1, a, 6-(a+b));
		sb.append(a+" "+b+"\n");
		function(n-1, 6-(a+b), b);
	
	}
}
