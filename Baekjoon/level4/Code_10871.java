package level4;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 28��
 * �� �� : X���� ���� ��
 */
public class Code_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().split(" ");
		String[] ss = sc.nextLine().split(" ");
		
		int num = Integer.parseInt(s[0]);
		
		int x = Integer.parseInt(s[1]);
		
		for(int i=0; i<num; ++i) {
			int a = Integer.parseInt(ss[i]);
			if(a<x)
				System.out.print(a+" ");
		}
			

	}

}
