package lesson03_02;

import java.util.Arrays;

/*
 * 작성일 : 2018년 04월 15일
 * 내 용 : 최소 heap 정렬 구현.
 */
public class Example1_HeapSort {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void buildHeap(int[] a) {
		int end = a.length-1;
		for(int i=end/2; i>=0; --i) {//자식이 있는 노드부터 시작.
			heapify(a, i, end);
		}
	}
	
	static void heapify(int[] a, int index, int end) {
		int leftChildIndex = 2*index+1;
		int rightChildIndex = 2*index+2;
		int smallIndex;
	
		//a[index]의 자식 유무 판단하기
		if(rightChildIndex<=end) { //자식이 둘다 있는 경우
			smallIndex = a[leftChildIndex]<a[rightChildIndex]? leftChildIndex : rightChildIndex;
		}
		else if(leftChildIndex<=end)//왼쪽 자식만 있는 경우
			smallIndex = leftChildIndex;
		else return; //자식이 없는 경우 
		
		if(a[smallIndex] < a[index]) {
			swap(a, index, smallIndex);
			heapify(a, smallIndex, end); // 바꾼 노드를 기준으로 다시 검사.
		}
	}
	
	static void heapSort(int[] a) {
		buildHeap(a);
		for(int end=a.length-1; end>=1; --end) {
			swap(a, 0, end);
			heapify(a, 0, end-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_2_Example1_HeapSort : 이예지");
		int[] a = { 3, 8, 2, 10, 4, 6, 7, 1, 9, 5 };
        heapSort(a);
        System.out.println(Arrays.toString(a));
	}

}
