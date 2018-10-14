package divideConquer;

import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 13일
 * 내 용 : 종이의 개수
 */

public class Code_1780 {

	//각 수의 개수
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
		
		//각 칸에 -1,0,1 입력
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		function(0,0);
		
		//전체 종이가 다 같은 수인지 아닌지 검사
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
		int a=0, b=0, c=0; //-1,0,1의 개수
		
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
		
		//한 구간이 다 -1 또는 0 또는 1 이면 해당하는 수에 +1, 그렇지 않으면 -1,0,1 각 개수만큼 +=1
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
