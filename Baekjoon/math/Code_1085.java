package algorithm;

/*
    작성일 : 2019년 08월 04일
    내 용 :  직사각형에서 탈출
    풀이과정 : x, y, w-x, h-y를 비교하여 가장 작은 값을 출력.
*/

import java.io.*;

public class Code_1085 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			String[] num = br.readLine().split(" ");

			int[] value = new int[4];

			value[0] = Integer.parseInt(num[0]);
			value[1] = Integer.parseInt(num[1]);
			value[2] = Integer.parseInt(num[2]) - value[0];
			value[3] = Integer.parseInt(num[3]) - value[1];

			int result = value[0];

			for (int i = 1; i < value.length; i++) {
				if (result > value[i]) {
					result = value[i];
				}
			}

			bw.write(String.valueOf(result));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}