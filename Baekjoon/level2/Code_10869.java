package level2;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 25��
 * �� �� : ��Ģ����
 *     �� �ڿ��� A�� B�� �־�����. �� ��, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 */
public class Code_10869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] s = input.nextLine().split(" ");
		
		System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])-Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])*Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])/Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])%Integer.parseInt(s[1]));

	}

}