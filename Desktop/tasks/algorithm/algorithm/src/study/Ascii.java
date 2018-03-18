package study;
/*
 * 작성일자 : 2018년 03월 18일  일요일
 * 내 용 : 영어 대문자, 소문자, 숫자0-9를 입력하면 아스키 코드를 출력하는 프로그램 작성.(백준11654 참고)
 */

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ascii : 이예지");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("대문자, 소문자 또는 숫자 0-9를 입력하세요.");
		String a = input.next();
		char x = a.charAt(0);
		System.out.println((int)x);
		//next로 String을 받을 수 없음. > String으로 받은 후 Char로 변환해줘야함.(charAt()사용) > 출력시 (int)해줘야 아스키 코드로 출력..
	}

}
