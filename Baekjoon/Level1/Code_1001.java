package level1;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 25��
 * �� �� : A-B
 * 		�� ���� A�� B�� �Է¹��� ����, A-B�� ����ϴ� ���α׷��� �ۼ�.
 */
public class Code_1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String[] s = input.nextLine().split(" ");
		
		System.out.println(Integer.parseInt(s[0])-Integer.parseInt(s[1]));
		
	}

}
