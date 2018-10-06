package greedy;

import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 06일
 * 내 용 : 병든 나이트
 */
public class Code_1783 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int width = sc.nextInt();
		long result=0;
		
		if(height==1) {
			result = 1; 
		}else if(height==2) {
			result = Math.min(3, (width-1)/2)+1;
		}else {
			if(width<7) {
				result = Math.min(3, width-1)+1;
			}else {
				result = 4+(width-7)+1; //=width-2
			}
		}
		
		System.out.println(result);
	}

}
