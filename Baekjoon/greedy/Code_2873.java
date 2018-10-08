package greedy;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 10�� 07��
 * �� �� : �ѷ��ڽ���
 */

public class Code_2873 {
	static StringBuffer sb = new StringBuffer();
	static StringBuffer s = new StringBuffer();//reverse��
	
	static void appendString(StringBuffer stringBuffer, char s, int n) {
		for(int i=0; i<n; ++i)
			sb.append(s);
		System.out.println(sb);
		sb = new StringBuffer();
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
		
		if(n%2!=0) { //��Ȧ��Ȧ , ��Ȧ��¦�� ���
			System.out.println("1��");
			for(int i=0; i<n; ++i) { //¦���� ���϶��� ���������� m-1��, Ȧ���� ���϶��� �������� m-1��, ���� ��-1��ŭ �Ʒ��� 
				System.out.println("i"+i);
				if(i%2==0)
					appendString(sb,'R', m-1);
				else
					appendString(sb,'L', m-1);
				if(i!=n-1)
					appendString(sb,'D', 1);
			}
		}else if(n%2==0 && m%2==1) { //��¦��Ȧ
			System.out.println("2��");

			//¦���� ���϶��� �Ʒ��� n-1��, Ȧ���� ���϶��� ���� n-1��, ���� ��-1��ŭ ���������� 
			for(int i=0; i<m; ++i) {
				if(i%2==0)
					appendString(sb,'D',n-1);
				else
					appendString(sb,'U',n-1);
				if(i!=m-1)
					appendString(sb,'R', 1);
			}
		}else if(n%2==0 && m%2==0){ //��¦��¦
			System.out.println("3��");

			int minX=0;
			int minY=1;
			
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
			
			System.out.println("minX: "+minX+" minY: "+minY+"->"+a[minX][minY]);
			
			//�ּҰ��� ���� ���϶����� ����A,B�� �� �྿ �̵�.
			int ax=0, ay=0;
			while(ax!=minX) { //¦���� ������+�Ʒ� , Ȧ���� ����+�Ʒ� 
				if(ax%2==0) {//���پ� �̵�
					appendString(sb,'R', m-1);
					appendString(sb,'D', 1);
				}else {
					appendString(sb,'L', m-1);
					appendString(sb,'D', 1);	
				}
				ax++;
			}
			int bx=0, by=0;
			StringBuffer s = new StringBuffer();
			while(bx!=minX) {
				if(bx%2==0) { //���پ� �̵� - �̵��ϴ� ������ �ݴ��̱� ������ R>L, U>D�� �ٲ㼭 �Է�
					appendString(s, 'L', m-1);
					appendString(s, 'D', 1);
				}else {
					appendString(s, 'R', m-1);
					appendString(s, 'D', 1);	
				}
				bx++;
			}
			
			while(ay!=minY) {
				if(ay%2==0) {
					appendString(sb, 'D', 1);
					appendString(sb, 'R', 1);
				}else {
					appendString(sb, 'U', 1);
					appendString(sb, 'R', 1);
				}
				ay++;
			}
			
			while(by!=minY) {
				if(by%2==0) {
					appendString(s, 'D', 1);
					appendString(s, 'R', 1);
				}else {
					appendString(s, 'U', 1);
					appendString(s, 'R', 1);
				}
				by++;
			}
			
			s.reverse();
		}
		System.out.println(s);
		
	}	
}	
