package algorithm;

/*
    작성일 : 2019년 04월 04일
    내 용 : 	단어의 개수
			영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어질 떄, 단어의 개수 찾기.
			문자열 앞,뒤에 공백 있을 수 있음. 연속된 공백은 주어지지 않음.
	풀이과정 :
		1. 사용자에게 문자열을 입력받는다.(예외 - 숫자입력, 공백만 주어질 때)
		2. 띄어쓰기로 구분해서 문자열 길이를 구한다.
		3. 출력한다.
		* 입력받는 문자열이 아예 비어있는 문자열일 때도 체크를 해주어야한다!
 */

import java.util.*;

public class Code_1152_2 {

	static final String REQUIRE_FOR_WORD_CONDITION = "잘못된 입력입니다. 다시 입력해주세요";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(countWordNumber(inputString(scanner)));

		scanner.close();
	}

	static int countWordNumber(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		return s.split(" ").length;
	}

	static String inputString(Scanner scanner) {
		String s;
		boolean result;

		do {
			s = scanner.nextLine().trim();
			result = checkString(s);
		}
		while (!result);

		return s;
	}

	static boolean checkString(String s) {
		if(s.isEmpty()){
			return true;
		}
		if ((!s.matches("[a-zA-Z\\s]+")) || s.length() <= 0) {
			System.out.println(REQUIRE_FOR_WORD_CONDITION);
			return false;
		}
		return true;
	}

}
