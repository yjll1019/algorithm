package algorithm;

/*
    작성일 : 2019년 04월 01일
    내 용 :  단어 공부
            주어지는 단어에서 가장 많이 사용된 알파벳 출력.(대문자와 소문자 구분하지 않음.)
 */

import java.util.*;

public class Code_1157 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine().toUpperCase();
		char[] arr = new char[26];
		int max = 0;
		char answer=' ';
		int idx;

		for(int i=0; i<s.length(); ++i){
			idx = s.charAt(i)-65;
			arr[idx]++;
			if(arr[idx]>max){
				max = arr[idx];
				answer = s.charAt(i);
			}else if(arr[idx]==max){
				answer = '?';
			}
		}

		System.out.println(answer);

	}

}
