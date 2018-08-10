package level7;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 10일
 * 내 용 : 아스키 코드
 * 		알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력.
 */
public class Code_11654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println((int)s.charAt(0));
		//char를 숫자로 나타내기위해서 
		//System.out.println(s.charAt(0)-'0');
		//이렇게 할 경우 입력한 값이 int형태로 출력
	}

}
