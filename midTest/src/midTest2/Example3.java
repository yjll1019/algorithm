package midTest2;

import java.util.Arrays;

public class Example3 {
	
	static void swap(int []s, int i, int j) {
		int temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
	
	static int partition(int[] s, int start, int end) {
		int value = s[end];
		int i=start-1;
				
		for(int j=start; j<=end-1; ++j) {
			if(s[j]<value) swap(s, ++i, j);
		}
		swap(s, i+1, end);
		System.out.println(Arrays.toString(s));
		return i+1;
	}
	
	public static void main(String[] args) {
		System.out.println("3.");
		int[] a1 = {4, 13, 5, 8, 1, 12, 9, 10, 11, 2, 3, 6, 7};
		partition(a1, 0, a1.length-1);
		System.out.println("4.");
		int[] a2 = {2, 12, 5, 3, 10, 7, 1, 11, 6, 4, 8, 13, 9};
		partition(a2, 0, a2.length-1);

	}
}
