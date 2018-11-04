package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 11�� 04��
 * �� �� : �̺� Ž�� - ������ ��ġ
 * 		1. x��ŭ ������ ��ġ�� �������� Ȯ���Ѵ�.
 * 			1-1. �����ϴٸ� x(������ ������ �Ÿ�)�� ����
 * 			1-2. �Ұ����ϴٸ� x(������ ������ �Ÿ�)�� ����
 * 		2. ������ �����ϴ� (������ ��ġ�� ������ �Ÿ�) x ���� �� �ִ밪 ���
 */
public class Code_2110 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //���� ����
		int c = sc.nextInt(); //������ ����
		
		long[] arr = new long[n];
		
		for(int i=0; i<n; ++i)
			arr[i] = sc.nextInt(); //���� ��ǥ �Է�
		
		Arrays.parallelSort(arr);
		
		long startValue = arr[0];
		long endValue = arr[n-1];
		long result = 0;
		
		while(startValue<=endValue) {
			long middleValue = (startValue+endValue)/2; //�����⸦ ��ġ�� ����
			long cCount = 1; //��ġ�� ������ ����
			long cPosition = arr[0]; //���� ���� ������ ��ġ�� ������ ��ġ
			
			for(int i=1; i<arr.length; ++i) {
				if(arr[i]-cPosition>=middleValue) {
					cCount++;
					cPosition = arr[i];
				}
			}
			
			if(cCount<c) { //middleValue�� ���� ��ġ�� ������ ������ ���� �� >> middleValue�� ����
				endValue = middleValue-1;
			}else {
				if(middleValue > result) //middleValue�� ���� ��ġ�� ������ ������ ���ų� ���� �� >> middleValue�� ���� 
					result = middleValue;
				startValue = middleValue+1;
			}
			
		}
		
		System.out.println(result);
	}
	 
}
