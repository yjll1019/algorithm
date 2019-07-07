package algorithm;

import java.io.*;
import java.util.Arrays;

/*
	작성일 : 07월 07일
	내 용 : 소트인사이드 - 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬하기.
	풀 이 : Arrays.sort(배열, new Comparator()) 이용하기.
 */

public class Code_1427 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			String[] arr = br.readLine().split("");

			Arrays.sort(arr, (o1, o2) -> {
				int i1 = Integer.parseInt(o1);
				int i2 = Integer.parseInt(o2);
				return i2 - i1;
			});

			for(String s : arr) {
				bw.write(s);
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
