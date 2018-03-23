package lesson03;
/*
 * 작성일 : 2018년 03월 23일
 * 내 용 : 배열에서 최소값의 인덱스를 리턴하는 findMin메소드 구현.
 */
public class Example3 {

	static int findMin(int[] a) {
		int min=0;
		for(int i=0; i<a.length; ++i) {
			if(a[min]>a[i])
				min = i;
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_Example3 : 이예지");

		int [] a1 = {17, 14, 11, 19};
		int [] a2 = {-17, -14, -11, -19};
		
		int minIndex = findMin(a1);
		System.out.println("a1의 최소값 인덱스 : "+minIndex);
		
		minIndex = findMin(a2);
		System.out.println("a2의 최소값 인덱스 : "+minIndex);

	}

}
