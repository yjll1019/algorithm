package algorithm;

/*
    작성일 : 2019년 07월 22일
    내 용 : 베르트랑 공준
    풀 이 : N < X < 2N의 범위에서 소수 X의 개수
    		X가 소수이려면 2 ~ X 제곱근사이의 수로 나누어지지 않아야 한다.

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Code_4948 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			List<Integer> nums = new ArrayList<>();

			while (true) {
				int num = Integer.parseInt(br.readLine());
				if(num == 0) {
					break;
				}
				nums.add(num);
			}

			for (int i = 0; i < nums.size(); ++i) {
				int startValue = nums.get(i);
				int primeCount = nums.get(i);

				for (int j = startValue + 1; j <= startValue * 2; ++j) {
					int sqrt = (int) Math.sqrt(j);

					if (j == 1) {
						primeCount--;
					}

					for (int z = 2; z <= sqrt; ++z) {
						if (j % z == 0) {
							primeCount--;
							break;
						}
					}
				}
				bw.write(String.valueOf(primeCount+"\n"));
				bw.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}