package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 * �ۼ��� : 2018�� 08�� 11��
 * �� �� : �׷� �ܾ� üĿ
 */
public class Code_1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());

		char t;
		boolean result; //�׷� �ܾ����� �ƴ����� üũ�ϴ� ����
		int count=0;//�׷� �ܾ��� ������ �����ϴ� ����
		
		Map<Character, Integer> map;
		//�Էµ� �ҹ��ڿ� Ƚ���� ��Ÿ���� map��ü
		
		while(n-->0) {
			result=true;
			String s = br.readLine();
			map = new HashMap<Character,Integer>();
			map.put(s.charAt(0), 1);
			
			for(int i=1; i<s.length(); ++i) {
				t = s.charAt(i);
				if(!map.containsKey(t)) {
					map.put(t, 1);
				}else { //���忡�� ���� ���ĺ��� ���� ��
					if(t!=s.charAt(i-1)) { //���ӵǾ����� ������
						result = false;
						break;
					}//���ĺ��� �ٷ� �� ���ĺ��� ���� ������
				}
			}
			if(result)
				count+=1;
			}
		System.out.println(count);
	}
}
