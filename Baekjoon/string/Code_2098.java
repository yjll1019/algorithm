package algorithm;

/*
    작성일 : 2019년 04월 12일
    내 용 : 	상수
			세 자리 수가 두 개 주어진다. 두 개의 수를 거꾸로 뒤집어서 비교한 후 큰 수를 출력.
	풀이과정 :
		1. 두 수를 StringBuilder.reverse()를 이용해 뒤집는다.
		2. Integer.parseInt()를 이용해 정수로 바꾼다.
		3. 두 개의 숫자 중 큰 수를 출력한다.
*/

import java.util.Scanner;

public class Code_2098 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(scanner.nextLine());
		stringBuilder.reverse();
		String[] arr = stringBuilder.toString().split(" ");
		System.out.println(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1]) ? arr[0] : arr[1]);

		scanner.close();
	}

	/*	int a = scanner.nextInt();
		int b = scanner.nextInt();

		int c = (a % 10) * 100 + ((a / 10) % 10) * 10 + (a / 100); //일의자리*100 + 십의자리*10 + 백의자리*1
		int d = (b % 10) * 100 + ((b / 10) % 10) * 10 + (b / 100);

		System.out.println((c > d) ? c : d);*/
}
