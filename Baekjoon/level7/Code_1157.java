package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 * �ۼ��� : 2018�� 08�� 10��
 * �� �� : �ܾ� ����
 */
public class Code_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	
		String s = br.readLine();

		s = s.toUpperCase();
		
		char result;
		
		int t;
		
		int [] arr = new int[26]; //A~Z�� ������ �����ϴ� �迭
		//�ƽ�Ű�ڵ� 65~90 
		for(int i=0; i<s.length(); ++i) {
			t = (int)s.charAt(i);
			arr[t-65] += 1;
		}
		
		int max=arr[0];
		int idx=0;
		for(int i=1; i<arr.length; ++i) {
			if(max<arr[i]) {
				max = arr[i]; //���ĺ� �ִ� Ƚ�� ����
				idx = i; //���ĺ� �ִ� Ƚ���� ����ִ� �ε��� ����
			}
		}

		result = (char)(idx+65);
		//�� : idx=0 +65 >> A

		for(int i=0; i<arr.length; ++i) {
			if(i==idx) {//���� �ִ밪�� �����ϰ�
				
			}
			else if(max==arr[i]) { //������ ���� �߿��� �ִ밪�� ���� ���� �ִ� ���
				result = '?';
			}
		}
		System.out.println(result);
		
	}
}
