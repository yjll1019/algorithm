package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �ۼ��� : 2018�� 08�� 11��
 * �� �� : ���
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
		
		a.reverse(); //���� ���� ������
		b.reverse();
		
		int c = Integer.parseInt(a.toString());
		int d = Integer.parseInt(b.toString());
		//String���� ���� ���ڵ��� int�� �ٲ� ����
		
		int result = (c>d)? c : d;
	
		System.out.println(result);
	}
}
