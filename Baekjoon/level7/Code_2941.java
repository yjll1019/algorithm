package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �ۼ��� : 2018�� 08�� 12��
 * �� �� : ũ�ξ�Ƽ�� ���ĺ�
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
