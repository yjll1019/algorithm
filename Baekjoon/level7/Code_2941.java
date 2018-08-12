package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일 : 2018년 08월 12일
 * 내 용 : 크로아티아 알파벳
 *  	
 */
public class Code_2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		String regex = "c=|c-|dz=|d-|lj|nj|s=|z=";
		
		s = s.replaceAll(regex, "s");

		System.out.println(s.length());
	}

}
