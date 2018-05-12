package midTest2;

import java.util.Arrays;

public class Example1 {

	static void mergeSort(int[] a, int start, int end) {
		if(start==end) return;
		int middle = (start+end)/2;
		mergeSort(a, start, middle);
		mergeSort(a, middle+1, end);
		merge(a, start, middle, end);
		System.out.println(Arrays.toString(a));
	}
	
	static void merge(int[] a, int start, int middle, int end) {
		int length = end-start+1;
		int index1 = start;
		int index2 = middle+1;
		int i=0;
		int [] temp = new int[length];
		
		while(index1 <= middle && index2 <= end) {
			if(a[index1] < a[index2]) {
				temp[i++]  = a[index1++];
			}
			else
				temp[i++] = a[index2++];
		}
		
		while(index1<=middle) {
			temp[i++] = a[index1++];
		}
		while(index2<=end) {
			temp[i++] = a[index2++];
		}
		for(i=0; i<temp.length; i++) {
			a[start+i] = temp[i]; 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.");
		int[] a1= {4, 13, 5};
		mergeSort(a1, 0, a1.length-1);
		System.out.println("====================");
		System.out.println("2.");
		int[] b1= {4, 13, 5, 8, 1};
		mergeSort(b1, 0, b1.length-1);
	}

}
