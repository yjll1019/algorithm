package midQuiz;
/*
 * 작성일 : 2018년 03월 26일
 * 내 용 : 알고리즘 중간 쪽지시험.
 */
public class Quiz4 {

	static void method1(int[]a, int index) {
		if(index >=a.length) return;
		System.out.printf("%d ", a[index]);
		method1(a, index+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("midQuiz_Quiz4 : 이예지");
		
		int [] a = {2, 4, 5};
		method1(a,0);
	}
}
