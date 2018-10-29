package divideConquer;

import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 28일
 * 내 용 : 별찍기10
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
			sb.append("\n"); //StringBuilder에 저장한 후 출력해야함. 그렇지 않으면 시간 초과가 뜬다.
		}
		
		System.out.println(sb);
	}
	
	static void function(int x, int y) {
		
		while(x!=0) {
			if(x%3==1 && y%3==1) { //나눈 나머지가 x,y 둘 다 1이어야 공백 출력
				sb.append(" ");
				return;
			}
			x/=3;
			y/=3;
		}
		sb.append("*");

		
	}

}
