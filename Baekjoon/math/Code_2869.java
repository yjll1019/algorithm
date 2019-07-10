package algorithm;

/*
	작성일 : 07월 10일
	내 용 : 달팽이는 올라가고 싶다.
	풀 이 : 하루 달팽이의 이동 거리는 (A-B)이고, 마지막 날(정상에 오르는 날)의 이동 거리는 A.
			x일 * (A-B) + A = V --> x = (V - A) / (A - B).
			x가 나누어 떨어지면 +1, 나누어 떨어지지 않으면 하루가 더 필요하는 뜻이기 때문에 +2
*/

import java.io.*;
import java.util.StringTokenizer;

public class Code_2869 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			int result = (v-a) / (a-b);

			if((v-a) % (a-b) == 0) {
				result++;
			} else {
				result = result + 2;
			}

			bw.write(String.valueOf(result));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
