package level4;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 28일
 * 내 용 : 시험 성적
 */
public class Code_9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(90<=num&&num<=100) 
			System.out.println("A");
		else if(80<=num&&num<=89)
			System.out.println("B");
		else if(70<=num&&num<=79)
			System.out.println("C");
		else if(60<=num&&num<=69)
			System.out.println("D");
		else
			System.out.println("F");
		

	}

}
