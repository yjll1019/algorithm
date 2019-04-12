package algorithm;

/*
    작성일 : 2019년 04월 12일
    내 용 : 	다이얼
			세 자리 수가 두 개 주어진다. 두 개의 수를 거꾸로 뒤집어서 비교한 후 큰 수를 출력.
	풀이과정 :
		1. 두 수를 StringBuilder.reverse()를 이용해 뒤집는다.
		2. Integer.parseInt()를 이용해 정수로 바꾼다.
		3. 두 개의 숫자 중 큰 수를 출력한다.
*/

import java.util.Scanner;

public class Code_5622 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] time = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
		String s = scanner.nextLine();
		int sum = 0;
		for (int i = 0; i < s.length(); ++i) {
			sum += time[s.charAt(i) - 65];
		}

		System.out.println(sum);
		scanner.close();
	}
}
