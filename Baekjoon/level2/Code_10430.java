package level2;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 25��
 * �� �� : ������
 *     ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C, ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.
 */
public class Code_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] s = input.nextLine().split(" ");
		
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int C = Integer.parseInt(s[2]);
		
		
		System.out.println((A+B)%C);
		System.out.println((A%C+B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C*B%C)%C);
}

}
