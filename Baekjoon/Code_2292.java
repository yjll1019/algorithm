package algorithm;

/*
    작성일 : 2019년 04월 28일
    내 용 : 	벌집
	풀이과정 :
		1. 1부터 이동횟수를 구하자면 1은 1칸, 1을 둘러싼 2~7은 2칸, 2~7을 둘러싼 8~19는 3칸이 걸린다. 둘러싼 수의 범위마다 1부터 이동횟수가 1씩 증가한다.
		2.  풀이과정 1의 규칙을 이용해서 입력된 숫자의 범위를 구해 이동횟수를 출력한다.
*/

import java.util.Scanner;

public class Code_2292 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int range = 1; //범위를 나타내는 변수
		int count = 1; //이동 횟수를 나타내는 변수

		while (number > range) {
			range += (6 * count);
			count++;
		}

		System.out.println(count);
		scanner.close();
	}

}
