package divideConquer;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 10�� 28��
 * �� �� : Z
 */
public class Code_1074 {

	static int cnt;
	static int r;
	static int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		 r = sc.nextInt();
		 c = sc.nextInt();
		
		cnt = 0;
		
		int x = (int) Math.pow(2, n);
		
		function(0, 0, x);

	}
	
	static void function(int x, int y, int n) {
		if(x==r && y==c) {
			System.out.println(cnt);
			return;
		}
		
		if(n==1) {
			cnt++;
			return;
		}
		
		if(!(x<=r && r<x+n && y<=c && c<y+n)) {
			//���� �˻��ϴ� ������ ������ �� ������ ���� �� ���ϰ� return;
			cnt += n*n;
			return;
		}
		
		function(x, y, n/2);
		function(x, y+n/2, n/2);
		function(x+n/2, y, n/2);
		function(x+n/2, y+n/2, n/2);
	}
}
