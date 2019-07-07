package algorithm;

/*
	작성일 : 07월 07일
	내 용 : 소수 - M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력.
	풀 이 : 에라토스테네스의 접근
		  자연수 N이 주어졌을 때, 2 ~ N의 제곱근까지 나눴을 때 나누어지지 않으면 소수
 */

import java.io.*;

public class Code_2581 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			int m = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int minVal = -1;
			int sum = 0;

			for (int i = m; i <= n; i++) {
				boolean result = true;
				int sqrt = (int) Math.sqrt(i);

				if(i == 1) continue;

				for (int j = 2; j <= sqrt; ++j) {
					if (i % j == 0) {
						result = false;
						break;
					}
				}

				if (result) {
					sum += i;
					if (minVal == -1) {
						minVal = i;
					}
				}
			}

			if(minVal != -1) {
				bw.write(sum + "\n");
			}
			bw.write(minVal + "");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
