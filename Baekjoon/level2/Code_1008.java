package level2;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 25��
 * �� �� : A/B
 *      �� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Code_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] s = input.nextLine().split(" ");
		
		System.out.println(Double.parseDouble(s[0])/Double.parseDouble(s[1]));
	}

}
