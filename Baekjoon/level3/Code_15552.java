package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * �ۼ��� : 2018�� 08�� 01��
 * �� �� : ���� A+B
 */
public class Code_15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		while(num-->0) {
			String[] a = br.readLine().split(" ");
			String x = String.valueOf(Integer.parseInt(a[0])+Integer.parseInt(a[1]));
			bw.write(x+"\n");
		}
		bw.flush(); //flush�� ȣ��Ǳ� ������ �ӽ÷� ������ ������ ���ۿ� ��� (������ ��� x)

	}
}
