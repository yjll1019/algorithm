package lesson01;
/*
 * 작성일자 : 2018년 03월 18일 
 * 내 용 : 반목문을 이용해서 배열을 한칸 씩 당기며 삭제하고 마지막 인덱스에 0 추가.
 */
public class Example2 {


	static void print(int[] a) {
		for(int i : a)
			System.out.printf("%d ", i);
	}
	
	static void remove(int [] a, int index) {
		int count = 0;
		for(int i=index; i<=a.length-2; i++) {
			a[i] = a[i+1];
		}
		a[a.length-1]=0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Example2 : 이예지");
		
		int[] a = new int[10];

		for(int i=0; i<a.length; ++i) {
			a[i] = i;
		}
		System.out.print("삭제 전 배열 출력: ");
		print(a);
	
		System.out.println();
	
		System.out.print("삭제 후 배열 출력: ");
		remove(a, 5);
		print(a);
	}

}
