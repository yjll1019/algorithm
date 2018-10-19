package greedy;

import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 07일
 * 내 용 : 롤러코스터
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
		StringBuilder s = new StringBuilder();//reverse용

		if(n%2==1) { //행홀열홀 , 행홀열짝인 경우
			for(int i=0; i<n; ++i) { //짝수번 행일때는 오른쪽으로 m-1번, 홀수번 행일때는 왼쪽으로 m-1번, 행의 수-1만큼 아래로 
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
		}else if(m%2==1) { //행짝열홀
			//짝수번 열일때는 아래로 n-1번, 홀수번 열일때는 위로 n-1번, 열의 수-1만큼 오른쪽으로 
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
		}else{ //행짝열짝
			int minX=0;
			int minY=1; //검은돌 중 최소값의 위치
			
			//최소값의 위치 찾기
			for(int i=0; i<n; ++i) {
				for(int j=0; j<m; ++j) {
					if((i+j)%2==1) //검은 칸일때
						if(a[minX][minY]>a[i][j]) {
							minX = i;
							minY = j;
						}
				}
			}
			
			int x1=0, y1=0, x2=n-1, y2=m-1;
						
			//행이동
			while(x2-x1>1) {//A점과 B지점이 한 줄차이 날 때까지
				//A지점에서 내려갈 때
				if(x1/2 < minX/2) { //최소값의 위치까지 2줄씩 이동하기 때문에 이동해도 되는지 확인.
					appendString(sb, 'R', m-1);
					appendString(sb, 'D', 1);
					appendString(sb, 'L', m-1);
					appendString(sb, 'D', 1);
					x1+=2;
				}
				
				//B지점에서 내려갈 때
				if(minX/2 < x2/2) {
					appendString(s, 'R', m-1);
					appendString(s, 'D', 1);
					appendString(s, 'L', m-1);
					appendString(s, 'D', 1);
					x2-=2;		
				}
			}
			
			//열이동
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
