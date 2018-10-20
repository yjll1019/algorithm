package divideConquer;

import java.util.Scanner; 
/*
 * 작성일 : 2018년 10월 19일
 * 내 용 : 쿼드트리
 */
public class Code_1992 {

	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//제일 작은 크기는 2*2=4
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.nextLine();
		
		arr = new int[n][n];

		//0과 1을 입력받은 후 배열에 저장.
		for(int i=0; i<n; ++i) {
			String s = sc.nextLine();
			for(int j=0; j<n; ++j) {
				arr[i][j] = s.charAt(j)-'0';
			}
		}
		
		function(0, 0, n);
		System.out.println(sb.toString());
	}
	
	static void function(int row, int col, int n) {	
		
		boolean same = true;
		
		for(int i=row; (i<row+n) && same; ++i) { //범위의 수들이 다 같은지 확인하기 위한 for문
			for(int j=col; (j<col+n) && same; ++j) {
				if(arr[i][j] != arr[row][col])
					same = false;
			}
		}
		
		if(same) {
			sb.append(arr[row][col]);
		}else {
			sb.append("(");
			function(row, col, n/2); //왼쪽 위
			function(row, col+(n/2), n/2); //오른쪽 위
			function(row+(n/2), col, n/2); //왼쪽 아래
			function(row+(n/2), col+(n/2), n/2);//오른쪽 아래
			sb.append(")");
		}
		
	}
	

	
}
