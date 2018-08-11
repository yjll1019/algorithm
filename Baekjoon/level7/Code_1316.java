package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 * 작성일 : 2018년 08월 11일
 * 내 용 : 그룹 단어 체커
 */
public class Code_1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());

		char t;
		boolean result; //그룹 단어인지 아닌지를 체크하는 변수
		int count=0;//그룹 단어의 개수를 저장하는 변수
		
		Map<Character, Integer> map;
		//입력된 소문자와 횟수를 나타내는 map객체
		
		while(n-->0) {
			result=true;
			String s = br.readLine();
			map = new HashMap<Character,Integer>();
			map.put(s.charAt(0), 1);
			
			for(int i=1; i<s.length(); ++i) {
				t = s.charAt(i);
				if(!map.containsKey(t)) {
					map.put(t, 1);
				}else { //문장에서 같은 알파벳이 있을 때
					if(t!=s.charAt(i-1)) { //연속되어있지 않으면
						result = false;
						break;
					}//알파벳이 바로 전 알파벳과 같지 않으면
				}
			}
			if(result)
				count+=1;
			}
		System.out.println(count);
	}
}
