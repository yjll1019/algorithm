package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일 : 2018년 08월 11일
 * 내 용 : 상수
 */
public class Code_2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	
		String[] s = br.readLine().split(" ");
		
		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();
		
		for(int i=0; i<3; ++i) {
			a.append(s[0].charAt(i));
		}
		
		for(int i=0; i<3; ++i) {
			b.append(s[1].charAt(i));
		}
		
		a.reverse(); //받은 숫자 뒤집기
		b.reverse();
		
		int c = Integer.parseInt(a.toString());
		int d = Integer.parseInt(b.toString());
		//String으로 받은 숫자들을 int로 바꿔 저장
		
		int result = (c>d)? c : d;
	
		System.out.println(result);
	}
}
