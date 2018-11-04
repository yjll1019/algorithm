package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 11�� 04��
 * �� �� : �̺� Ž�� - ���� �ڸ���
 */
public class Code_2805 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //������ ����
		int m = sc.nextInt(); //���� �������� ������ ����
		
		long[] arr = new long[n];
		
		for(int i=0; i<n; ++i)
			arr[i] = sc.nextInt();
		
		Arrays.parallelSort(arr);
		
		//�������� ���� �� ���� ���� ���� ���� ū ��
		long startValue = 0; 
		long endValue = arr[n-1];	
		long result = 0;

		while(startValue <= endValue) {
			long middleValue  = (startValue+endValue)/2;
			long m2 = 0;
			
			for(int i=0; i<arr.length; ++i) {
				if(arr[i]>middleValue) {
					m2 += arr[i]-middleValue;
				}
			}
			
			if(m2>=m) {
				result = Math.max(result, middleValue);
				startValue=middleValue+1;
			}else {
				endValue=middleValue-1;
			}
		}
		
		System.out.println(result);
		
	}
	 
}
