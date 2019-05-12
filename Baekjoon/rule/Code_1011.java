package algorithm;

/*
    작성일 : 2019년 04월 29일
    내 용 :  Fly me to the Alpha Centauri
    풀이과정 : 블로그를 참조해 규칙을 이해함.
    	http://blog.naver.com/PostView.nhn?blogId=occidere&logNo=220982644540&categoryNo=0&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView
*/

import java.util.Scanner;

public class Code_1011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcaseNumber = scanner.nextInt();
		while (testcaseNumber-- > 0) {
			findMinimumLength(scanner.nextInt(), scanner.nextInt());
		}
		scanner.close();
	}

	public static void findMinimumLength(int start, int end) {
		int distance = end - start;
		int squareRoot = (int) Math.round(Math.sqrt(distance));

		if (Math.pow(squareRoot, 2) - squareRoot - 1 <= distance && distance <= Math.pow(squareRoot, 2)) {
			System.out.println(2 * squareRoot - 1);
		} else if (Math.pow(squareRoot, 2) < distance && distance <= Math.pow(squareRoot, 2) + squareRoot) {
			System.out.println(2 * squareRoot);
		} else {
			System.out.println(-1);
		}
	}
}