package lesson01;
/*
 * 작성일자 : 2018년 03월 18일
 * 내 용 : 재귀호출 연습.
 */
public class Example6 {

	static void print(int [] arr, int index) {
		//재귀호출을 이용해 배열의 값을 출력하는 메소드 print
		if(index >= arr.length) return; //종료 조건.
		System.out.printf("%d ", arr[index]); //현재 단계. 
		print(arr,index+1);//다음 단계 재귀 호출.
	}
	
	static int sum(int n) {
		//1부터 n까지의 합계를 계산하는 메소드 sum
		if(n<1) return 0;
		return n+sum(n-1); 
	}
	//<=1로 처리하게되면 만약에 0이 들어와서 계산되면 1이 되기때문에.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example6 : 이예지");
		System.out.println();
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		System.out.print("print메소드 출력 결과 : ");
		print(a, 0);
		
		System.out.println();
		System.out.printf("sum메소드 출력 결과 : %d", sum(3));
	}

}
