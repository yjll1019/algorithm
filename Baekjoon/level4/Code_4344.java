package level4;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 01일
 * 내 용 : 평균은 넘겠지
 * 		각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째자리까지 출력한다.
 */
public class Code_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //케이스 수
		sc.nextLine();
				
		while(x-->0) {
		String[] score = sc.nextLine().split(" ");
		double count = 0;
		double num = Integer.parseInt(score[0]);
		double sum = 0;
			
		for(int i=1; i<score.length; ++i) {
			sum+=Integer.parseInt(score[i]);
		}
		double aver = sum/num;
		
		for(int i=1; i<score.length; ++i) {
			if(aver<Integer.parseInt(score[i]))
				count++;
		}
	
		System.out.printf("%.3f",count/num*100);
		System.out.print("%\n");
		
		}
	}

}
