package lesson03;
/*
 * 작성일 : 2018년 03월 23일 
 * 내 용 : 배열에서 a[i]와 a[j]의 값을 바꾸는 swap메소드 구현.
 */
import java.util.Arrays;

public class Example2 {
	
	static void swap(int []a, int i, int j) {
		int n = a[i];
		a[i] = a[j];
		a[j] = n;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("lesson03_Example2 : 이예지");
		
		int[] a = {2, 4};
		
		System.out.println(Arrays.toString(a));		
		swap(a,0,1);		
		System.out.println(Arrays.toString(a));
		
	}

}
