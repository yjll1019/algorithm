package level6;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 10��
 * �� �� : OX����
 	OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ�.
 */
public class Code_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		sc.nextLine();
		
		String ox;
		
		int sum,count;
		
		int [] arr;
		
		while(n-->0) {
			ox  = sc.nextLine();
			arr = new int[ox.length()];
			 count=0;
			 sum=0;
		 	//�� �������� ������ �����ϱ� ���� �迭
			for(int i=0; i<ox.length(); ++i) {
				if(ox.charAt(i)=='O') {
					if(count==0) {
						arr[i] = 1;
						count = 1;
					}else {
						arr[i] = count+1;
						count +=1;
					}
				}else {
					count=0;
					arr[i] = 0;
				}
			}
			
			for(int i=0; i<ox.length(); ++i) {
				sum += arr[i];
			}
			
			System.out.println(sum);
		}
		
	}

}
