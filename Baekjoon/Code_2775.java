package algorithm;

/*
    작성일 : 2019년 04월 28일
    내 용 : 	부녀회장이 될테야
	풀이과정 :
		1. 반복문 + 규칙 이용 - citizenNumber[i][j] = citizenNumber[i-1][j] + citizenNumber[i][j-1]
		2. 반복문 이용 - 0층 1호부터 입력되는 k층 n호까지 거주민 수를 더해가며 구한다.
		3. 재귀함수 이용
*/

import java.util.Scanner;

public class Code_2775 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcaseNumber = scanner.nextInt();

		while (testcaseNumber-- > 0) {
			System.out.println(findCitizenNumber(scanner.nextInt(), scanner.nextInt()));
		}
		scanner.close();
	}

	public static int findCitizenNumber(int 층, int 호) {
		int[][] citizenNumber = new int[층 + 1][호 + 1];

		for (int j = 1; j <= 호; ++j) {
			citizenNumber[0][j] = j; //0층 거주민 수 채우기.
		}

		for (int i = 1; i <= 층; ++i) {
			for (int j = 1; j <= 호; ++j) {
				citizenNumber[i][j] = citizenNumber[i - 1][j] + citizenNumber[i][j - 1]; //규칙 이용
			}
		}

		return citizenNumber[층][호];
	}

	/*public static void findCitizenNumber(int 층, int 호) {
		//n층 n호 = n층 1호 + 2호 + ... + n-1호
		int[][] citizenNumber = new int[층 + 1][호 + 1];

		for (int j = 1; j <= 호; ++j) {
			citizenNumber[0][j] = j; //0층 거주민 수 채우기.
		}

		for (int i = 1; i <= 층; ++i) {
			for (int j = 1; j <= 호; ++j) {
				for (int z = 1; z <= j; ++z) {
					citizenNumber[i][j] += citizenNumber[i - 1][z];
				}
			}
		}

		System.out.println(citizenNumber[층][호]);
	}*/

	/*public static int findCitizenNumber(int 층, int 호) {
		if (호 == 0) {
			return 0;
		}
		if (호 == 1) {
			return 1;
		}
		if (층 == 0) {
			return 호;
		}

		return findCitizenNumber(층 - 1, 호) + findCitizenNumber(층, 호 - 1);
	}*/
}
