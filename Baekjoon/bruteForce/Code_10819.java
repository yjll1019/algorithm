package bruteForce;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 12�� 09��
 * �� �� :  ���̸� �ִ�� - ��� ����� ���� �� ���غ��� �ִ밪 ���.
 */
public class Code_10819 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = 0;
		do {
			int temp = calculate(arr);
			sum = Math.max(sum, temp);
		}while(next_permutation(arr));
		
        System.out.println(sum);
	}
	
	public static int calculate(int arr[]) {
		int sum = 0;
		for(int i=1; i<arr.length; ++i)
			sum += Math.abs(arr[i]-arr[i-1]); //���밪 ��ȯ, i-1 - i�� ����ص� �ȴ�.
		return sum;
	}
	
	public static boolean next_permutation(int[] arr) {
		int i = arr.length-1;
		while(i>0 && arr[i-1]>=arr[i]) {
			i -= 1;
		}
		
		if(i<=0) {
			return false;
		}
		
		int j = arr.length-1;
		
		while(arr[j]<=arr[i-1]) {
			j -= 1;
		}
		
		int temp = arr[i-1];
		arr[i-1] = arr[j];
		arr[j] = temp;
		
		j = arr.length-1;
		
		while(i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i +=1;
			j -=1;
		}
		
		return true;
	}
}
