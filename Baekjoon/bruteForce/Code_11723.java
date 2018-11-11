package bruteForce;

import java.util.Scanner;

/*
 * 작성일 : 2018년 11월 11일
 * 내 용 : 완전 탐색 - 비트마스크 (매 번 출력하면 시간초과가 뜬다! >> StringBuffer에 저장해두고 한 번에 출력하기!)
 */
public class Code_11723 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt() + 1; // 수행해야하는 연산의 수

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
				if ((x & (1 << num)) >= 1) { // num이 있음
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			} else if (st.equals("toggle")) {
				if ((x & (1 << num)) >= 1) { // num이 있음
					x &= ~(1 << num);
				} else {
					x |= (1 << num);
				}
			} else if (st.equals("all")) { // 1~20까지 모든 수 채우기
				x = (1 << 20) - 1;
			} else { // empty - 공집합으로 만들기
				x = 0; // 다 0으로 만들기.
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
