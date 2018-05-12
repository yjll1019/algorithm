package midTest2;

import java.util.Arrays;

public class Example5 {
	
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
		return i+1;
	}
	
	static void quickSort(int[] s, int start, int end) {
		
		if(start>=end) return ;
		int middle = partition(s, start, end);
		quickSort(s, start, middle-1);
		quickSort(s, middle+1, end);
		System.out.println(Arrays.toString(s));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5.");
		int[] a1 = {4, 13, 5, 8};
		quickSort(a1, 0, a1.length-1);
		System.out.println("====================");
		System.out.println("6.");
		int[] b1 = {4, 13, 5, 8, 1, 6};
		quickSort(b1, 0, b1.length-1);
	}

}
