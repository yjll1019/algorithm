package level6;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 10일
 * 내 용 : 숫자의 개수
 		세 자연수 A*B*C의 결과값에서 숫자 0~9가 몇 번 쓰였는지 출력.
 */
public class Code_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String x = String.valueOf(a*b*c);
		
		int [] arr = new int[10]; //0~9까지 횟수를 저장할 배열
		
		for(int i=0; i<x.length(); ++i) {
			arr[(x.charAt(i)-'0')]+=1;
		}
		
		for(int i : arr)
			System.out.println(i);
		
	}

}
