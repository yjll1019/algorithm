package greedy;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 10�� 06��
 * �� �� : ���� ����Ʈ
 */
public class Code_1783 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int width = sc.nextInt();
		long result=0;
		
		if(height==1) {
			result = 1; 
		}else if(height==2) {
			result = Math.min(3, (width-1)/2)+1;
		}else {
			if(width<7) {
				result = Math.min(3, width-1)+1;
			}else {
				result = 4+(width-7)+1; //=width-2
			}
		}
		
		System.out.println(result);
	}

}
