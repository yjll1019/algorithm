package divideConquer;

import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 29일
 * 내 용 : 별찍기11
 */
public class Code_2448 {
	
	static boolean[][] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new boolean[n][2*n-1];
	
		function(n, 0, n-1); // (개수, 행, 열)
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; ++i) {
			for(int j=0; j<(2*n-1); ++j) {
				if(arr[i][j])
					sb.append("*");
				else	
					sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}

	static void function(int n, int x , int y) {
		if(n==3) {
			arr[x][y] = true;
			arr[x+1][y-1] = arr[x+1][y+1] = true;
			arr[x+2][y-2] = arr[x+2][y-1] = arr[x+2][y] = arr[x+2][y+1] = arr[x+2][y+2] = true;
		 return ;
		}
		
		function(n/2, x, y);
		function(n/2, x+(n/2), y-(n/2));
		function(n/2, x+(n/2), y+(n/2));

	}
	
}
