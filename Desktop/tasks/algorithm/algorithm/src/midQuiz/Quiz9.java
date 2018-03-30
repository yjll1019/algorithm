package midQuiz;
/*
 * 작성일 : 2018년 03월 26일
 * 내 용 : 알고리즘 중간 쪽지시험.
 */
public class Quiz9 {
	
	static void print(int[] a) {
		for(int i=0; i<a.length; ++i) {
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}
	
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void bubbleSort(int[] a) {
		for (int i = a.length - 1; i >= 1; --i) {
			boolean 완료 = true;
			for (int j = 0; j < i; ++j) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					완료 = false;
				}
			}
			print(a);
			if (완료) break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("midQuiz_Quiz9 : 이예지");
		
		int[] a = {7, 4, 1, 9, 3};
		bubbleSort(a);
	}
}
