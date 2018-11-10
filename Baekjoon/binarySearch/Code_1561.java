package binarySearch;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 11�� 10��
 * �� �� : �̺� Ž�� - ���� ����
 */
public class Code_1561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //N���� ���̵�
		int m = sc.nextInt(); //M���� ���̱ⱸ ����
		
		int[] arr = new int[m]; //���̱ⱸ�� ���� �ð��� ��Ÿ���� �迭
		
		for(int i=0; i<arr.length; ++i)
			arr[i] = sc.nextInt(); //���̱ⱸ�� ���� �ð� �Է�
		
		if(n <= m) {
			System.out.println(n);
			return;
		}
		
		long leftTime = 0;
		long rightTime =  2000000000L * 1000000L; 
		
		while(leftTime<=rightTime) {
			long midTime = (rightTime+leftTime)/2;
			
			long minN = 0; //midTime�� ���̱ⱸ�� ź �л� �� (�ּ�)
			long maxN = m; //midTime�� ���̱ⱸ�� ź �л� �� (�ִ�)

			for(int i=0; i<arr.length; ++i) {
				maxN += (midTime/arr[i]);
				if(midTime%(arr[i])==0) {
					minN--;
				}
			}
			
			minN += maxN+1;
			
			if(n<minN) {
				rightTime = midTime-1;
			}else if(maxN<n) {
				leftTime = midTime+1;
			}else { //n�� minN�� maxN������ ���
				for(int i=0; i<arr.length; ++i) {
					if(midTime % arr[i]==0) {
						if(n == minN) {
							System.out.println(i+1);
							return;
						}else {
							minN++;
						}
					}
				}
			}
		}
		
	}

}
