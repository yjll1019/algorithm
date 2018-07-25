package level2;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 25일
 * 내 용 : 사칙연산
 *     두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 */
public class Code_10869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] s = input.nextLine().split(" ");
		
		System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])-Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])*Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])/Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])%Integer.parseInt(s[1]));

	}

}
