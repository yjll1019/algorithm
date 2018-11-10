package binarySearch;

import java.util.Scanner;

/*
 * 작성일 : 2018년 11월 10일
 * 내 용 : 이분 탐색 - 사다리
 */
public class Code_2022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double c = sc.nextDouble();
		
		double left = 0.0;
		double right = Math.min(x, y);

		//mid값으로 h를 구하고 구한 h와 c를 비교해 다시 mid값을 조절.
		while (Math.abs(right - left) > 1e-6) {//Math.abs : 절대값을 반환하는 메소드
			double mid = (left + right) / 2.0; //d를 나타내는 변수 mid

			double h1 = Math.sqrt(x*x - mid*mid); //Math.sqrt 제곱근을 반환하는 메소드
			double h2 = Math.sqrt(y*y - mid*mid);

			double h = (h1 * h2) / (h1 + h2);

			if (h > c) {
				left = mid;
			} else{
				right = mid;
			}
		}
		
		System.out.printf("%.3f", left); //소수 3째 자리까지 출력.
		
	}

}
