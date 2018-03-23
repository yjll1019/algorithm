package lesson02;
/*
 * 작성일 : 2018년 03월 22일
 * 내 용 : 재귀호출의 출력 결과 예상
 */
public class Example5 {

	static void print(int [] a, int index) {
		if(index == a.length) return ;
		System.out.printf("%d ", a[index]);
		print(a, index+1);
		
	}
	
	static int sum(int [] a, int index) {
		
		if(index == a.length) return 0;
		return a[index] + sum(a, index+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example 5 : 이예지");
		
		int [] a = new int[10];
		for(int i=0; i<a.length; i++) {
			a[i] = i;
		}
		
		print(a,0);
		System.out.println();
		System.out.println("출력결과:" + sum(a, 0));
	}

}
