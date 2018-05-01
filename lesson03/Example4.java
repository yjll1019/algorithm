package lesson03;
/*
 * 작성일 : 2018년 03월 23일
 * 내 용 : 배열의 시작 위치부터 끝까지에서 가장 작은 값의 위치(인덱스)를 리턴하는 메소드 findMin 구현.
 */
public class Example4 {

	static int findMin(int[] a, int index) {
		int min = index;
		for(int i=index; i<a.length; ++i) {
			if(a[min] > a[i]) {
				min = i;
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lesson03_Example4 : 이예지");
		
		int [] a = {14, 11, 13, 15};
		
		for(int i=0; i<a.length; ++i) {
			int minIndex = findMin(a, i);
			System.out.println(a[minIndex]);
		}
		
	}

}
