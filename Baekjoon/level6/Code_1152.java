package level6;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 07일
 * 내 용 : 단어의 개수
 * 		첫째 줄에 단어의 개수를 출력한다.
 */
public class Code_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String s = sc.nextLine();

		s = s.trim();

		String[] a = s.split("\\s"); // 공백 문자

		for (int i = 0; i < a.length; ++i)
			if (a[i].length() != 0)
				count++;

		System.out.println(count);

	}

}
