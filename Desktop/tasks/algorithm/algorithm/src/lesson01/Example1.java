package lesson01;
/*
 * 작성일자 : 2018년 03월 18일
 * 내 용 : 반목문을 이용해서 배열을 한칸 씩 뒤로 미루며 삽입.
 */
public class Example1 {
	
	static void print(int[] a) {
		for(int i : a)
			System.out.printf("%d ", i);
	}
	
	static void insert(int []a, int index, int value) {

		for(int i=a.length-1; i>index; --i) {
			a[i] = a[i-1];
		}

		a[index] = value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Example1 : 이예지");
		
		int[] a = new int[10];

		for(int i=0; i<a.length; ++i) {
			a[i] = i;
		}
		System.out.print("삽입 전 배열 출력: ");
		print(a);
	
		System.out.println();
	
		insert(a, 5, -99);
		System.out.print("삽입 후 배열 출력: ");
		print(a);
	}

}
