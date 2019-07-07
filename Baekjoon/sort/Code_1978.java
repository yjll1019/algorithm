package algorithm;

/*
	작성일 : 07월 07일
	내 용 : 소수찾기 - 주어진 수들 중에서 소수의 개수 구하기.
	풀 이 : 에라토스테네스의 접근
		  자연수 N이 주어졌을 때, 2 ~ N의 제곱근까지 나눴을 때 나누어지지 않으면 소수
 */

import java.io.*;

public class Code_1978 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			int num = Integer.parseInt(br.readLine());
			String[] arr = br.readLine().split(" ");
			int count = 0;

			if(num == 0) {
				System.out.println(0);
				return;
			}

			for (String s : arr) {
				boolean result = true;
				int value = Integer.parseInt(s);
				int sqrt = (int) Math.sqrt(value);

				if(value == 1) continue;

				for(int i = 2; i <= sqrt; ++i) {
					if(value % i == 0) {
						result = false;
					}
				}
				if(result) count++;
			}
			bw.write(count+"");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
