package level6;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 07��
 * �� �� : �ܾ��� ����
 * 		ù° �ٿ� �ܾ��� ������ ����Ѵ�.
 */
public class Code_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String s = sc.nextLine();

		s = s.trim();

		String[] a = s.split("\\s"); // ���� ����

		for (int i = 0; i < a.length; ++i)
			if (a[i].length() != 0)
				count++;

		System.out.println(count);

	}

}
