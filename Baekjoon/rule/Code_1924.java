package algorithm;

/*
    작성일 : 2019년 04월 28일
    내 용 : 	2007년
	풀이과정 :
		1. (월의 수 + 일의 수)%7 한 나머지를 구한다.
		2. 나머지에 따라서 요일을 출력한다.
*/

import java.util.Scanner;

public class Code_1924 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] s = scanner.nextLine().split(" ");
		findDay(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
		scanner.close();
	}

	public static void findDay(int month, int day) {
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int dayNumber = 0;

		for (int i = 1; i < month; ++i) {
			dayNumber += months[i - 1];
		}

		dayNumber += day;

		System.out.println(week[dayNumber % 7]);
	}

}
