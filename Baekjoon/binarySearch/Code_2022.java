package binarySearch;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 11�� 10��
 * �� �� : �̺� Ž�� - ��ٸ�
 */
public class Code_2022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double c = sc.nextDouble();
		
		double left = 0.0;
		double right = Math.min(x, y);

		//mid������ h�� ���ϰ� ���� h�� c�� ���� �ٽ� mid���� ����.
		while (Math.abs(right - left) > 1e-6) {//Math.abs : ���밪�� ��ȯ�ϴ� �޼ҵ�
			double mid = (left + right) / 2.0; //d�� ��Ÿ���� ���� mid

			double h1 = Math.sqrt(x*x - mid*mid); //Math.sqrt �������� ��ȯ�ϴ� �޼ҵ�
			double h2 = Math.sqrt(y*y - mid*mid);

			double h = (h1 * h2) / (h1 + h2);

			if (h > c) {
				left = mid;
			} else{
				right = mid;
			}
		}
		
		System.out.printf("%.3f", left); //�Ҽ� 3° �ڸ����� ���.
		
	}

}
