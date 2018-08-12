package level7;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 작성일 : 2018년 08월 12일
 * 내 용 : 다이얼
 */
public class Code_5622 {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int [] a = new int[26];
		//A-Z의 번호를 저장하는 int형 배열
		
		for(int i=0; i<a.length; ++i) {
			if(i<=2) 
				a[i] = 2;
			else if(i<=5)
				a[i] = 3;
			else if(i<=8)
				a[i] = 4;
			else if(i<=11)
				a[i] = 5;
			else if(i<=14)
				a[i] = 6;
			else if(i<=18)
				a[i] = 7;
			else if(i<=21)
				a[i] = 8;
			else
				a[i] = 9;
		}
		
		int t;
		int sum=0;
		for(int i=0; i<s.length(); ++i) {
			t = s.charAt(i);
			sum+=a[t-65]+1;
		}
		
		System.out.println(sum);
	}
}
