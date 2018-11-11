package bruteForce;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 11�� 11��
 * �� �� : ���� Ž�� - ��Ʈ����ũ (�� �� ����ϸ� �ð��ʰ��� ���! >> StringBuffer�� �����صΰ� �� ���� ����ϱ�!)
 */
public class Code_11723 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt() + 1; // �����ؾ��ϴ� ������ ��

		int x = 0;

		String[] s;

		StringBuffer sb = new StringBuffer();
		
		while (m-- > 0) {
			s = sc.nextLine().split(" ");

			String st = s[0];

			int num = 0;

			if (s.length > 1) {
				if (s[1] != null)
					num = Integer.parseInt(s[1]) - 1;
			}

			if (st.equals("add")) {
				x |= (1 << num);
			} else if (st.equals("remove")) {
				x &= ~(1 << num);
			} else if (st.equals("check")) {
				if ((x & (1 << num)) >= 1) { // num�� ����
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			} else if (st.equals("toggle")) {
				if ((x & (1 << num)) >= 1) { // num�� ����
					x &= ~(1 << num);
				} else {
					x |= (1 << num);
				}
			} else if (st.equals("all")) { // 1~20���� ��� �� ä���
				x = (1 << 20) - 1;
			} else { // empty - ���������� �����
				x = 0; // �� 0���� �����.
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
