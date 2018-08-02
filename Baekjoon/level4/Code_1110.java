package level4;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 02일
 * 내 용 : 더하기 사이클
 * 		첫째 줄에 N의 사이클 길이를 출력한다.
 * 
 */
public class Code_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = num;
		int cnt=0;
		int x;
		do{
			cnt++;
			num2 = (num2%10*10)+((num2%10+num2/10)%10);
		}while(num2!=num);
		
		System.out.println(cnt);	
		
	}
}
