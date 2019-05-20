package algorithm;

/*
    작성일 : 2019년 05월 20일
    내 용 :  카잉 달력
*/
import java.util.Scanner;

public class Code_6064 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testcaseNumber = scanner.nextInt();

		while (testcaseNumber-- > 0) {
			findOrder(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		}

		scanner.close();
	}

	//한 바퀴를 돌지 않을 땐 어떻게 할 것인지?
	public static void findOrder(int m, int n, int x, int y) {
		int count = x % (m + 1);
		int temp = x;

		for (int i = 0; i < n; i++) {
			int yValue = temp % n == 0 ? n : temp % n;
			if (yValue == y) {
				break;
			}

			temp = yValue + m;
			count += m;
		}
		System.out.println(count > lcm(m, n) ? "-1" : count);
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

}