package level6;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 10��
 * �� �� : ��� ����
 */
public class Code_10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		
		int [] score = new int[5];
		
		for(int i=0; i<n; ++i) {
			score[i] = sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0; i<n; ++i) {
			if(score[i]<40) {
				score[i]=40;
			}
			sum+=score[i];
		}
		
		System.out.println(sum/5);
	}
}
