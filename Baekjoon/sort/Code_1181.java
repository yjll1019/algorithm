package algorithm;

import java.io.*;
import java.util.Arrays;

/*
	작성일 : 07월 07일
	내 용 : 단어 정렬 - 알파벳 소문자로 이루어진 N개의 단어가 들어오면 단어의 길이가 짧은 순서대로 정렬하고,
		같은 길이일 경우 사전 순으로 정렬하기.
	풀 이 : Arrays.sort(배열, new Comparator()) 이용하기.
 */
public class Code_1181 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int num = Integer.parseInt(br.readLine());
			String[] arr = new String[num];

			for (int i = 0; i < num; i++) {
				arr[i] = br.readLine();
			}

			Arrays.sort(arr, (o1, o2) -> {
				if (o1.length() != o2.length()) {
					return o1.length() - o2.length();
				}
				return o1.compareTo(o2);
			});

			Arrays.stream(arr)
					.distinct()
					.forEach(s -> System.out.println(s)) //bw 쓰고 싶은데 어떻게 쓰나요.. 왜 자꾸 에러나죠.. @지혜지
			;

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
