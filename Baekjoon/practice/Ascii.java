package study;
/*
 * �ۼ����� : 2018�� 03�� 18��  �Ͽ���
 * �� �� : ���� �빮��, �ҹ���, ����0-9�� �Է��ϸ� �ƽ�Ű �ڵ带 ����ϴ� ���α׷� �ۼ�.(����11654 ����)
 */

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ascii : �̿���");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�빮��, �ҹ��� �Ǵ� ���� 0-9�� �Է��ϼ���.");
		String a = input.next();
		char x = a.charAt(0);
		System.out.println((int)x);
		//next�� String�� ���� �� ����. > String���� ���� �� Char�� ��ȯ�������.(charAt()���) > ��½� (int)����� �ƽ�Ű �ڵ�� ���..
	}

}
