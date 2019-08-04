package algorithm;

/*
    작성일 : 2019년 08월 04일
    내 용 :  골드바흐의 추측
    풀이과정 :1. 소수를 검증할 수 있는 배열을 만든다.
    		 2. 입력받은 수를 N이라고 할 때, N/2끼리 더해보고 왼쪽은 -- 오른쪽은 ++하며 둘 다 소수일 때 값을 출력.

*/
import java.io.*;

public class Code_9020 {
	private static boolean prime[] = new boolean[10001];

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int num = Integer.parseInt(br.readLine());
			int[] nums = new int[num];

			for (int i = 0; i < num; i++) {
				nums[i] = Integer.parseInt(br.readLine());
			}
			setPrime();
			for (int x : nums) {
				findPrimeNumber(x);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void findPrimeNumber(int num) {
		int smallNumber = num / 2;
		int bigNumber = num / 2;

		while (!prime[smallNumber] || !prime[bigNumber]) {
			smallNumber--;
			bigNumber++;
		}
		System.out.println(smallNumber + " " + bigNumber);
	}

	private static void setPrime() {
		for (int i = 2; i <= 10000; i++) {
			if (isPrime(i)) {
				prime[i] = true;
			}
		}
	}

	private static boolean isPrime(int i) {
		for (int j = 2; j <= (int) Math.sqrt(i); ++j) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}