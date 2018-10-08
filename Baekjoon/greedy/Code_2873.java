package greedy;

import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 07일
 * 내 용 : 롤러코스터
 */

public class Code_2873 {
	static StringBuffer sb = new StringBuffer();
	static StringBuffer s = new StringBuffer();//reverse용
	
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
		
		if(n%2!=0) { //행홀열홀 , 행홀열짝인 경우
			System.out.println("1번");
			for(int i=0; i<n; ++i) { //짝수번 행일때는 오른쪽으로 m-1번, 홀수번 행일때는 왼쪽으로 m-1번, 행의 수-1만큼 아래로 
				System.out.println("i"+i);
				if(i%2==0)
					appendString(sb,'R', m-1);
				else
					appendString(sb,'L', m-1);
				if(i!=n-1)
					appendString(sb,'D', 1);
			}
		}else if(n%2==0 && m%2==1) { //행짝열홀
			System.out.println("2번");

			//짝수번 열일때는 아래로 n-1번, 홀수번 열일때는 위로 n-1번, 열의 수-1만큼 오른쪽으로 
			for(int i=0; i<m; ++i) {
				if(i%2==0)
					appendString(sb,'D',n-1);
				else
					appendString(sb,'U',n-1);
				if(i!=m-1)
					appendString(sb,'R', 1);
			}
		}else if(n%2==0 && m%2==0){ //행짝열짝
			System.out.println("3번");

			int minX=0;
			int minY=1;
			
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
			
			System.out.println("minX: "+minX+" minY: "+minY+"->"+a[minX][minY]);
			
			//최소값과 같은 행일때까지 지점A,B를 한 행씩 이동.
			int ax=0, ay=0;
			while(ax!=minX) { //짝수면 오른쪽+아래 , 홀수면 왼쪽+아래 
				if(ax%2==0) {//한줄씩 이동
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
				if(bx%2==0) { //한줄씩 이동 - 이동하는 방향이 반대이기 때문에 R>L, U>D로 바꿔서 입력
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
