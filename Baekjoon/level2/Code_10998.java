package level2;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 25일
 * 내 용 : A×B
 *      두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
 */
public class Code_10998 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] s = input.nextLine().split(" ");
		
		System.out.println(Integer.parseInt(s[0])*Integer.parseInt(s[1]));
	}

}
