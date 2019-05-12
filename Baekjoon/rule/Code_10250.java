package algorithm;

/*
    작성일 : 2019년 04월 29일
    내 용 :  ACM 호텔
    풀이과정 :
		1. h층 w호 n번째 손님일 때 층 = n%h, 호 = n/h+1가 된다.
    	2. n%h = 0 일 때(꼭대기층일 때)는 층 = h, 호 =  n/h
*/

import java.util.Scanner;

public class Code_10250 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int testcaseNumber = scanner.nextInt();
		while (testcaseNumber-- > 0) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			int n = scanner.nextInt();
			findRoomNumber(h, n);
		}
		scanner.close();
	}

	public static void findRoomNumber(int h, int n) {
		int 층 = n % h;
		int 호;

		if (층 != 0) {
			호 = n / h + 1;
		} else {
			층 = h;
			호 = n / h;
		}

		System.out.printf("%d%02d\n", 층, 호);
	}

}
