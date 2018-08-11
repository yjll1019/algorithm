package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 * 작성일 : 2018년 08월 10일
 * 내 용 : 단어 공부
 */
public class Code_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	
		String s = br.readLine();

		s = s.toUpperCase();
		
		char result;
		
		int t;
		
		int [] arr = new int[26]; //A~Z의 개수를 저장하는 배열
		//아스키코드 65~90 
		for(int i=0; i<s.length(); ++i) {
			t = (int)s.charAt(i);
			arr[t-65] += 1;
		}
		
		int max=arr[0];
		int idx=0;
		for(int i=1; i<arr.length; ++i) {
			if(max<arr[i]) {
				max = arr[i]; //알파벳 최대 횟수 저장
				idx = i; //알파벳 최대 횟수가 들어있는 인덱스 저장
			}
		}

		result = (char)(idx+65);
		//예 : idx=0 +65 >> A

		for(int i=0; i<arr.length; ++i) {
			if(i==idx) {//현재 최대값은 제외하고
				
			}
			else if(max==arr[i]) { //나머지 값들 중에서 최대값과 같은 값이 있는 경우
				result = '?';
			}
		}
		System.out.println(result);
		
	}
}
