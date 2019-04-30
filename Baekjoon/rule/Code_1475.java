package algorithm;

/*
    작성일 : 2019년 04월 28일
    내 용 : 	방 번호
	풀이과정 :
		1. 0~9까지의 배열을 만든 후, 숫자가 나올 때마다 count를 한다.
		2. 6, 9를 번갈아가며 저장한다.
		3. 배열 중에서 가장 큰 수를 꺼낸다.
*/

import java.util.Scanner;

public class Code_1475 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		findSetNumber(scanner.nextLine().split(""));
		scanner.close();
	}

	public static void findSetNumber(String[] number) {
		int[] arr = new int[10];
		int n = 0;
		int max = 0;

		for (int i = 0; i < number.length; ++i) {
			int num = Integer.parseInt(number[i]);
			if (num == 6 || num == 9) {
				num = (n % 2 == 0) ? 6 : 9;
				n++;
			}
			arr[num]++;
		}

		for(int i : arr){
			if(max<i){
				max = i;
			}
		}

		System.out.println(max);

		/*
		Map을 이용한 방법.
		Map<String, Integer> map = new HashMap<>();
		int n = 0;

		for (int i = 0; i < number.length; ++i) {
			String s = number[i];
			if (s.equals("6") || s.equals("9")) {
				if (n % 2 == 0) {
					s = "6";
				} else {
					s = "9";
				}
				n++;
			}
			if (map.containsKey(s)) {
				int count = map.get(s);
				map.put(s, count + 1);
			} else {
				map.put(s, 1);
			}
		}

		int max = 0;
		for (String key : map.keySet()) {
			int value = map.get(key);
			if (value > max) {
				max = value;
			}
		}

		System.out.println(max);*/
	}
}
