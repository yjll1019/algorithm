package divideConquer;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 10�� 13��
 * �� �� : ������ ����
 */

public class Code_1780 {

	//�� ���� ����
	static int minusOne = 0;
	static int zero = 0;
	static int one = 0;
	static int[][] arr;
	static boolean[][] checkArr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new int[n][n];
		checkArr = new boolean[n][n];
		
		//�� ĭ�� -1,0,1 �Է�
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		function(0,0);
		
		//��ü ���̰� �� ���� ������ �ƴ��� �˻�
		if(minusOne>0&&zero==0&&one==0) {
			minusOne = 1;
		}else if(minusOne==0&&zero>0&&one==0) {
			zero = 1;
		}else if(minusOne==0&&zero==0&&one>0) {
			one = 1;
		}
		
		System.out.println(minusOne);
		System.out.println(zero);
		System.out.println(one);
		
	}
	
	static void function(int rowIndex, int colIndex) {
		int a=0, b=0, c=0; //-1,0,1�� ����
		
		if(rowIndex>arr.length-1 || colIndex>arr.length-1 || checkArr[rowIndex][colIndex]==true)
			return;
		
		checkArr[rowIndex][colIndex]=true;
		
		for(int i=rowIndex; i<rowIndex+3; ++i) {
			for(int j=colIndex; j<colIndex+3; ++j) {

				int x = arr[i][j]; 
				if(x==-1) {
					a+=1;	
				}else if(x==0) {
					b+=1;
				}else
					c+=1;
			}
		}
		
		//�� ������ �� -1 �Ǵ� 0 �Ǵ� 1 �̸� �ش��ϴ� ���� +1, �׷��� ������ -1,0,1 �� ������ŭ +=1
		if(a>0&&b==0&&c==0)	{
			minusOne+=1;
		}else if(a==0&&b>0&&c==0) {
			zero+=1;
		}else if(a==0&&b==0&&c>0) {
			one+=1;
		}else {
			minusOne+=a;
			zero+=b;
			one+=c;
		}
		
		function(rowIndex+3, colIndex);
		function(rowIndex, colIndex+3);
	}
}
