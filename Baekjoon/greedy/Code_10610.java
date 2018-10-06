package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * �ۼ��� : 2018�� 10�� 06��
 * �� �� : 30 - �־��� ���ڵ��� ���� 30�� ����� �ȴٸ� �� �� ���. 30�� ����� �Ұ����ϴٸ� -1���.
 * 			���� ���� �� �ִ� ���� ���� ����� ���� ū �� ���.
 */
public class Code_10610 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		List<Integer> numList = new ArrayList<Integer>(); //�ڸ��� �ϳ��ϳ��� �����ϴ� ����Ʈ
		
		int plus = 0; //������ �ڸ� ���� ����ϱ� ���� ����

		StringBuffer result = new StringBuffer();
		
		for(int i=0; i<num.length(); ++i) {
			int a = num.charAt(i)-'0';
			numList.add(a);
			plus += a;
		}
		
		Collections.sort(numList); //������������ ����
		
		if(plus%3!=0 || numList.get(0)!=0) //������ �ڸ����� 3�� ����� �ƴϰų� �Է��� ���� �ڸ��� �߿��� 0�� ���� ���
			System.out.println(-1);
		else {
			for(int i=numList.size()-1; i>=0; --i) {
				result.append(numList.get(i));
			}
			System.out.println(result);
		}
	}

}
