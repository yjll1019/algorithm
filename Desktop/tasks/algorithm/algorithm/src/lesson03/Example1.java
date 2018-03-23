package lesson03;
//findMin2 selectionSort2 아직 이해 ㄴㄴㄴ!
import java.util.Arrays;

/*
 * 작성일 : 2018년 03월 23일
 * 내 용 : 선택정렬(selection sort) 구현
 */
public class Example1 {

	static void swap(int[] a, int i, int j) {
		//배열 a에서 a[i]와 a[j]의 값을 바꿔주는 메소드 swap
		//O(1)
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int findMin(int[] a, int start) {
		//배열 a[start]에서 부터 끝까지 원소 중 가장 작은 값의 위치(인덱스)를 리턴하는 메소드 findMin
		//앞에서부터 시작해 최솟값을 찾아 앞에 위치시키는 방식
		//O(n)
		int min = start;
		for(int i=start; i<a.length; ++i) {
			if(a[min] > a[i])
				min = i;
		}
		return min;
	}
	
	static int findMin2(int[] a, int start) {
		//배열 a[start]에서부터 끝까지원소 중 가장 작은 값의 위치(인덱스)를 리턴하는 메소드 findMin2
		//뒤에서부터 시작해 최댓값을 찾아 뒤에 위치시키는 방식
		//O(n)
		int max = a.length-1;
		for(int i=a.length-1; i<=1; --i) {
			if(a[max] < a[i])
				max = i;
		}
		return max;
	}
	
	static void selectionSort(int[] a) {
		//O(log n)
		int min=0;
		
		for(int i=0; i<a.length-1; ++i) { //어쩌피 마지막 인덱스부터 마지막 인덱스까지 비교하는게 의미가 없기 때문에 a.length-1임.
			min = findMin(a, i); //i의 위치부터 a[i]보다 작은  중 제일 작은 값의 인덱스를 리턴, 없으면 그대로 i리턴
			if(min!=i) swap(a, i, min); //min과 i가 다르면(그대로 i가 아닌 가장 작은 값이 리턴 되었다면) a[i]와 a[min]의 값을 바꾼다.
		}
	}
	
	static void selectionSort2(int[] a) {
		//O(log n)
		int min=0;
		
		for(int i=a.length-1; i<=1; ++i) { //어쩌피 마지막 인덱스부터 마지막 인덱스까지 비교하는게 의미가 없기 때문에 a.length-1임.
			min = findMin2(a, i); //i의 위치부터 a[i]보다 작은  중 제일 작은 값의 인덱스를 리턴, 없으면 그대로 i리턴
			if(min!=i) swap(a, i, min); //min과 i가 다르면(그대로 i가 아닌 가장 작은 값이 리턴 되었다면) a[i]와 a[min]의 값을 바꾼다.
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_Example1 : 이예지");
		
		int [] a = {17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };
		
		selectionSort(a); //O(n)
		System.out.println(Arrays.toString(a));
		
		selectionSort2(a); //O(n)
		System.out.println(Arrays.toString(a));
	}

}
