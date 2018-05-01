package midQuiz;
/*
 * 작성일 : 2018년 03월 26일
 * 내 용 : 알고리즘 중간 쪽지시험.
 */
public class Quiz7 {

	static int sum(int n) {
		if(n<1) return 1;
		System.out.printf("%d ", n);
		return n + sum(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("midQuiz_Quiz4 : 이예지");
		
		int [] a = {2, 4, 5};
		System.out.printf("%d ", sum(3));
	}
}
