package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 작성일 : 2018년 10월 06일
 * 내 용 : 30 - 주어진 숫자들을 섞어 30의 배수가 된다면 그 수 출력. 30의 배수가 불가능하다면 -1출력.
 * 			만약 만들 수 있는 수가 여러 개라면 가장 큰 수 출력.
 */
public class Code_10610 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		List<Integer> numList = new ArrayList<Integer>(); //자리수 하나하나씩 저장하는 리스트
		
		int plus = 0; //숫자의 자리 합을 계산하기 위한 변수

		StringBuffer result = new StringBuffer();
		
		for(int i=0; i<num.length(); ++i) {
			int a = num.charAt(i)-'0';
			numList.add(a);
			plus += a;
		}
		
		Collections.sort(numList); //오름차순으로 정렬
		
		if(plus%3!=0 || numList.get(0)!=0) //숫자의 자리합이 3의 배수가 아니거나 입력한 수의 자리수 중에서 0이 없는 경우
			System.out.println(-1);
		else {
			for(int i=numList.size()-1; i>=0; --i) {
				result.append(numList.get(i));
			}
			System.out.println(result);
		}
	}

}
