package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �ۼ��� : 2018�� 08�� 10��
 * �� �� : ���ڿ� �ݺ�
 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� T�� ���� �� ����ϴ� ���α׷��� �ۼ�.
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
	//Scanner ���� �� ���� BufferedReader���°� �ð��� �� ���� ���� �� �ִ�!
	
	/*
	 Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //�׽�Ʈ ���̽� ��
		
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
