package level6;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 10��
 * �� �� : ������ ����
 		�� �ڿ��� A*B*C�� ��������� ���� 0~9�� �� �� �������� ���.
 */
public class Code_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String x = String.valueOf(a*b*c);
		
		int [] arr = new int[10]; //0~9���� Ƚ���� ������ �迭
		
		for(int i=0; i<x.length(); ++i) {
			arr[(x.charAt(i)-'0')]+=1;
		}
		
		for(int i : arr)
			System.out.println(i);
		
	}

}
