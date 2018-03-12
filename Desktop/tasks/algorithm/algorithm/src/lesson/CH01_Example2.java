package lesson;
/*
 * 작성일자 : 2018년 03월  12일 월요일
 * 내 용 : 재귀함수를 사용하여 1부터 파라미터로 전달된 수까지의 합을 리턴.
 */
public class CH01_Example2 {

	static int sum(int n) {
		if (n == 1) //나 : if(n<1) return 0;
			return 1; //return 1을 함으로써 메소드 자체가 종료되며 n이 1미만으로 감소하지 않는다.
		return n + sum(n-1);
	}

	public static void main(String[] args) {
		for(int i=3; i<=10; ++i) {
			System.out.printf("%d %d\n", i, sum(i));
		}
	}
	
}
