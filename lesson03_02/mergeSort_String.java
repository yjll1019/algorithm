package lesson03_02;

import java.util.Arrays;

/*
 * 작성일 : 2018년 03월 24일
 * 내 용 : 병합정렬 (mergeSort)로 String[] 정렬하기.
 */

public class mergeSort_String {

	static void mergeSort(String[] s, int start, int end) {
		
			if(start<end) {
				int middle = (start+end)/2;
				mergeSort(s, start, middle);
				mergeSort(s, middle+1, end);
				merge(s, start, middle, end);
			}
	}
	
	static void merge(String []s, int start, int middle, int end) {
		int 길이 = end-start+1;
		String [] temp = new String[길이];
		int i = 0;
		int index1 = start;
		int index2 = middle+1;
		
		while(index1<=middle && index2<=end) {
			if(s[index1].compareTo(s[index2])<0) //s[index1]이 s[index2]와 비교했을 때 작으면
				temp[i++]=s[index1++];
			else
				temp[i++]=s[index2++];
		}
		
		while(index1<=middle)
			temp[i++] = s[index1++];
		
		while(index2<=end)
			temp[i++] = s[index2++];
		
		
		for(i=0; i<temp.length; ++i) {
			s[start+i] = temp[i];
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_2_mergeSort_Stirng : 이예지");
		
		String [] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		System.out.println("mergeSort정렬 전 : "+Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println("mergeSort정렬 후 : "+Arrays.toString(arr));
		
	}

}
