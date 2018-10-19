package greedy;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 10�� 07��
 * �� �� : �ѷ��ڽ���
 */

public class Code_2873 {
	
	public static void appendString(StringBuilder s, char c, int n) {
		for(int i=0; i<n; ++i)
			s.append(c);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		int[][] a = new int[n][m];
		
		for(int i=0; i<n; ++i) {
			for(int j=0; j<m; ++j) {
				a[i][j] = sc.nextInt();
			}
		}
		
		StringBuilder sb = new StringBuilder();
		StringBuilder s = new StringBuilder();//reverse��

		if(n%2==1) { //��Ȧ��Ȧ , ��Ȧ��¦�� ���
			for(int i=0; i<n; ++i) { //¦���� ���϶��� ���������� m-1��, Ȧ���� ���϶��� �������� m-1��, ���� ��-1��ŭ �Ʒ��� 
				if(i%2==0) {
					appendString(sb,'R', m-1);
					if(i!=n-1){
						appendString(sb,'D', 1);
					}
				}else {
					appendString(sb,'L', m-1);
					appendString(sb,'D', 1);
				}
			}
		}else if(m%2==1) { //��¦��Ȧ
			//¦���� ���϶��� �Ʒ��� n-1��, Ȧ���� ���϶��� ���� n-1��, ���� ��-1��ŭ ���������� 
			for(int i=0; i<m; ++i) {
				if(i%2==0) {
					appendString(sb,'D',n-1);
					if(i != m-1) {
						appendString(sb, 'R', 1);
					}
				}
				else {
					appendString(sb,'U',n-1);
					appendString(sb,'R', 1);
				}
			}
		}else{ //��¦��¦
			int minX=0;
			int minY=1; //������ �� �ּҰ��� ��ġ
			
			//�ּҰ��� ��ġ ã��
			for(int i=0; i<n; ++i) {
				for(int j=0; j<m; ++j) {
					if((i+j)%2==1) //���� ĭ�϶�
						if(a[minX][minY]>a[i][j]) {
							minX = i;
							minY = j;
						}
				}
			}
			
			int x1=0, y1=0, x2=n-1, y2=m-1;
						
			//���̵�
			while(x2-x1>1) {//A���� B������ �� ������ �� ������
				//A�������� ������ ��
				if(x1/2 < minX/2) { //�ּҰ��� ��ġ���� 2�پ� �̵��ϱ� ������ �̵��ص� �Ǵ��� Ȯ��.
					appendString(sb, 'R', m-1);
					appendString(sb, 'D', 1);
					appendString(sb, 'L', m-1);
					appendString(sb, 'D', 1);
					x1+=2;
				}
				
				//B�������� ������ ��
				if(minX/2 < x2/2) {
					appendString(s, 'R', m-1);
					appendString(s, 'D', 1);
					appendString(s, 'L', m-1);
					appendString(s, 'D', 1);
					x2-=2;		
				}
			}
			
			//���̵�
			while(y2-y1 > 1) {
				if(y1/2 < minY/2) {
					appendString(sb, 'D', 1);
					appendString(sb, 'R', 1);
					appendString(sb, 'U', 1);
					appendString(sb, 'R', 1);
					y1+=2;
				}
				if(minY/2 < y2/2) {
					appendString(s, 'D', 1);
					appendString(s, 'R', 1);
					appendString(s, 'U', 1);
					appendString(s, 'R', 1);
					y2-=2;
				}
			}
			
			if(minY == y1) {
				appendString(sb, 'R', 1);
				appendString(sb, 'D', 1);
			}else {
				appendString(sb, 'D', 1);
				appendString(sb, 'R', 1);
			}
			
			s.reverse();
			sb.append(s);
		}
		
		System.out.println(sb);
	}
}	
