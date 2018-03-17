package lesson01;

public class Recursive {
	static int rec(int n) {
		if(n<=1) return 1; //종료 조건
		return n * rec(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3; i<=10; ++i) {
			System.out.println("i="+i+" >> "+rec(i));
		}
	}

}
