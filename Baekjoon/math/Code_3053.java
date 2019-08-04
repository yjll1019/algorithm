package algorithm;

/*
    작성일 : 2019년 08월 04일
    내 용 :  택시기하학
    풀이과정 : 문제를 잘 이해하지 못했음..
    		검색해보니 유클리드 기하학에서 원의 넓이는 파이 x 지름의 제곱이고,
    		택시 기하학에서 원의 넓이는 2 x 지름의 제곱이다.
    		해당 값을 소수 여섯 자리까지 출력하자.
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code_3053 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int r = Integer.parseInt(br.readLine());

			double euclidValue = (Math.PI * Math.pow(r, 2));
			double taxiValue = (2 * Math.pow(r, 2));

			System.out.printf("%.6f\n", euclidValue);
			System.out.printf("%.6f\n", taxiValue);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}