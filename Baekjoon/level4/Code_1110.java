package level4;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 02��
 * �� �� : ���ϱ� ����Ŭ
 * 		ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.
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
