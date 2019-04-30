package algorithm;

/*
    작성일 : 2019년 04월 28일
    내 용 : 	분수찾기
	풀이과정 :
		1. 대각선으로 1번째 줄에는 1/1, 2번째 줄에는 2/1와 1/2, 3번째 줄에는 3/1, 2/2, 1/3 이있다.
		2. 주어진 수 x가 몇 번째 줄인지 찾는다.
		3. 홀수면 분자가 줄의 숫자부터, 짝수면 1부터 시작해 x번째가 될 때까지 증가 또는 감소시킨다. --> for문을 이용할 필요없이 얼마나 이동할지만 계산하면 된다.
			예) 3일 경우 3 -> 2 -> 1, 4일 경우 1 -> 2 -> 3-> 4
		4. (줄+1) = 분자 + 분모 이므로 3번을 통해 분자, 분모를 구해 출력한다.
*/

import java.util.Scanner;

public class Code_1193 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		findFraction(x);
		scanner.close();
	}

	public static int findLine(int x) {
		int line = 0;
		int numberRange = 0;

		while (numberRange < x) {
			numberRange += ++line;
		}
		return line;
	}

	public static int getNumberRange(int number){
		return number*(number+1)/2;
	}

	public static void findFraction(int x) {
		int line = findLine(x);
		int numberRanger = getNumberRange(line);
		int 분자;
		int 분모;

		분자 = x - (numberRanger - line);
		분모 = (line + 1) - 분자;

		if (line % 2 == 1) {
			System.out.println(분모 + "/" + 분자);
		} else {
			System.out.println(분자 + "/" + 분모);
		}
	}
	/*
	원래는 분수를 구할 때 이렇게 코드를 작성하였으나, 중복되는 코드가 싫어서 추출했음.
	public static void findFraction(int line, int numberRange, int x) {
		int 분자;
		int 분모;
		int count = numberRange - line;

		if (line % 2 == 1) {
			분자 = line + 1;
			while (count < x) {
				분자--;
				count++;
			}
		} else {
			분자 = 0;
			while (count < x) {
				분자++;
				count++;
			}
		}
		분모 = (line + 1) - 분자;
		System.out.println(분자 + "/" + 분모);
	}*/

}
