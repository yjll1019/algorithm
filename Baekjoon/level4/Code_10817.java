package level4;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 01일
 * 내 용 : 세 수 - 세 정수 중 두번 째로 큰 수찾기.
 */
public class Code_10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] score = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(score[0]);
		int b = Integer.parseInt(score[1]);
		int c = Integer.parseInt(score[2]);
		
		int result=a;
		//20 30 10
		if(a<=b) {
			if(b<=c) {
				System.out.println(b);
			}else if(a<=c) {
				System.out.println(c);
			}else {
				System.out.println(a);
			}
		}else if(b<=c) {
			if(c<=a) {
				System.out.println(c);
			}else if(b<=a) {
				System.out.println(a);
			}else {
				System.out.println(b);
			}
		}else if(c<=a){
			if(a<=b)
				System.out.println(a);
			else if(c<=b)
				System.out.println(b);
			else {
				System.out.println(c);
			}
		}
			
		


	}

}
