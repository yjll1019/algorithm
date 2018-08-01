package level4;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 01일
 * 내 용 : 평균
 */
public class Code_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String[] arr = sc.nextLine().split(" ");
		double sum=0;
		double max = Integer.parseInt(arr[0]);
		
		for(int i=1; i<arr.length; ++i) {
			int x = Integer.parseInt(arr[i]);
			if(max<x)
				max = x;
		}

		for (int i = 0; i < arr.length; ++i) {
			double y = Integer.parseInt(arr[i]);
			sum += y / max * 100;
		}
		
		System.out.println(String.format("%.2f", sum/num));
		
	}

}
