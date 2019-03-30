package algorithm;

import java.util.*;

/*
	작성일 : 2019년 03월 30일
	내 용 : 문자열 반복
			문자열 "2 ABC"가 주어지면 AABBCC를 출력.
 */
public class Code_2675 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = scanner.nextInt();
		scanner.nextLine();
		String[] s;
		int count;

		while(n-->0){
			s = scanner.nextLine().split(" ");
			count = Integer.parseInt(s[0]);
			for(int i=0; i<s[1].length(); ++i){
				for(int j=0; j<count; ++j){
					sb.append(s[1].charAt(i));
				}
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}

