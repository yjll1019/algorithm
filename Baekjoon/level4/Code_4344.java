package level4;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 01��
 * �� �� : ����� �Ѱ���
 * 		�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��°�ڸ����� ����Ѵ�.
 */
public class Code_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //���̽� ��
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
