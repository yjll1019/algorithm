package divideConquer;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 10�� 28��
 * �� �� : �����10
 */
public class Code_2447 {

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				function(i,j);
			}
			sb.append("\n"); //StringBuilder�� ������ �� ����ؾ���. �׷��� ������ �ð� �ʰ��� ���.
		}
		
		System.out.println(sb);
	}
	
	static void function(int x, int y) {
		
		while(x!=0) {
			if(x%3==1 && y%3==1) { //���� �������� x,y �� �� 1�̾�� ���� ���
				sb.append(" ");
				return;
			}
			x/=3;
			y/=3;
		}
		sb.append("*");

		
	}

}
