package level4;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 28일
 * 내 용 : 평균
 */
public class Code_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String[] score = sc.nextLine().split(" ");
		
		int max=Integer.parseInt(score[0]);
		
		for(int i=1; i<num; ++i) {
			int x = Integer.parseInt(score[i]);
			if(max<x)
				max = x;
		}
		
		int sum = max;
		
		for(int i=0; i<score.length; ++i) {
			int x = Integer.parseInt(score[i]);
			if(max!=x)
				sum+=x/max*100;
		}
		
		System.out.println(sum);
	}

}
