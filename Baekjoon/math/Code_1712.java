package algorithm;

/*
	작성일 : 07월 10일
	내 용 : 손익분기점
	풀 이 : (a + x * b) < (x * c) --> a < x(c - b) --> a / (c - b) < x
			a / (c -b)는 투자 비용과 판매 수익이 같거나 근접하게 가까운..? 개수.
			따라서 위의 값에 +1한 것이 손익분기점.
*/

import java.io.*;
import java.util.StringTokenizer;

public class Code_1712 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (b >= c) {
				bw.write(String.valueOf(-1));
				return;
			}

			long result = a / (c - b) + 1;
			bw.write(String.valueOf(result));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
