package algorithm;

/*
    작성일 : 2019년 04월 04일
    내 용 : 	그룹단어체커
			그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우를 말한다.
			aaba는 그룹단어가 아니지만 aaab는 그룹단어이다. 또, kin도 그룹단어이다.
			첫 째줄에 단어의 개수 N이 주어지고, 둘 째줄부터는 N개의 줄에 단어가 주어진다.
	풀이과정 :
		1. 사용자에게 단어 개수를 입력받는다. (예외사항 - 숫자이외의 문자열 입력, 1~100 이외의 숫자 입력.)
		2. 1에서 입력한 수만큼 사용자에게 단어를 입력받는다. (예외사항 - a-z를 제외한 문자열 입력)
		3. 그룹단어인지 체크한다.
			3-1. boolean 배열의 값이 true인가?(이전에 해당 알파벳이 존재하는가?)
				3-1-1. 앞의 알파벳과 현재 위치의 알파벳이 같은가?
					3-1-1-1. 같다 -> 그룹단어의 조건에 해당. continue
					3-1-1-2. 같지 않다. -> 그룹단어의 조건에 해당하지 않으므로 return false
			3-2. boolean 배열의 값이 false인가?(이전에 해당 알파벳이 존재하지 않는가?) -> 해당 인덱스의 값을 true로 변경.
		4. 체크 결과에 따라서 groupWordCount를 증가시킨다.
		5. 출력한다.
 */

import java.util.*;

public class Code_1316 {

	static final String REQUIRE_FOR_WORD_COUNT = "잘못된 입력입니다. 다시 입력해주세요.";
	static final String REQUIRE_FOR_WORD_CONDITION = "잘못된 입력입니다. 1부터 100자리의 영어 소문자만 입력해주세요.";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int wordCount = inputWordCount(scanner);
		int groupWordCount = 0;

		while (wordCount-- > 0) {
			if (checkGroupWord(inputWord(scanner))) {
				groupWordCount++;
			}
		}

		System.out.println(groupWordCount);
		scanner.close();
	}

	static boolean checkGroupWord(String word) {
		boolean[] checkArray = new boolean[26];

		for (int i = 0; i < word.length(); ++i) {
			char alphabet = word.charAt(i);
			int alphabetIdx = alphabet-'a';

			if(i==0){
				checkArray[alphabetIdx] = true;
				continue;
			}
			if(checkArray[alphabetIdx]){
				if(alphabet != word.charAt(i-1)){
					return false;
				}
			}else{
				checkArray[alphabetIdx] = true;
			}
		}

		return true;

	}

	static int inputWordCount(Scanner scanner) {
		String wordCount;
		boolean result;

		do {
			wordCount = scanner.nextLine();
			result = checkWordCount(wordCount);
		}
		while (!result);

		return Integer.parseInt(wordCount);
	}

	static boolean checkWordCount(String wordCount) {
		if (!wordCount.matches("[1-9]||[1-9][0-9]{1,2}") || Integer.parseInt(wordCount) > 100) { // 100이하 자연수만 받도록 (조건 : 1,2,3자리 숫자면서 100이하)
			System.out.println(REQUIRE_FOR_WORD_COUNT);
			return false;
		}
		return true;
	}

	static String inputWord(Scanner scanner) {
		String word;
		boolean result;

		do {
			word = scanner.nextLine();
			result = checkWord(word);
		}
		while (!result);

		return word;
	}

	static boolean checkWord(String word) {
		if (!word.matches("[a-z]+")) {
			System.out.println(REQUIRE_FOR_WORD_CONDITION);
			return false;
		}
		return true;
	}

}
