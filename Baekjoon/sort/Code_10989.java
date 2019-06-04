package algorithm;

import java.io.*;

/*
	작성일 : 06월 04일
	내 용 : 계수 정렬

 */
public class Code_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[10001];

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; ++i) {
			int x = Integer.parseInt(br.readLine());
			arr[x] += 1;
		}

		for (int i = 1; i <= 10000; ++i) {
			if (arr[i] > 0) {
				for (int j = 0; j < arr[i]; ++j) {
					bw.write(i + "\n");
				}
			}
		}
		bw.close();
	}
}
