package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일 : 2018년 08월 10일
 * 내 용 : 문자열 반복
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램을 작성.
 */
public class Code_2675 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] s;
		
		StringBuilder sb = new StringBuilder();;
		
		while(n-->0) {
			s = br.readLine().split(" ");

			int t = Integer.parseInt(s[0]);
			
			for(int i=0; i<s[1].length(); ++i) {
				for(int j=0; j<t; ++j) {
					sb.append(s[1].charAt(i));
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	//Scanner 쓰는 것 보다 BufferedReader쓰는게 시간을 반 정도 줄일 수 있다!
	
	/*
	 Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //테스트 케이스 수
		
		sc.nextLine();
		
		String [] s;
		
		StringBuilder sb;
		
		while(n-->0) {
			s = sc.nextLine().split(" ");
			int t = Integer.parseInt(s[0]);
			sb = new StringBuilder();
			for(int j=0; j<s[1].length(); ++j) {
				for(int i=0; i<t; ++i) {
					sb.append(s[1].charAt(j));
				}
			}
			System.out.println(sb);
		}
	 
	 */
}
