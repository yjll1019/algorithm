package lesson02;
/*
 * 작성일자 : 2018년 03월 22일
 * 내 용 : 입력 배열의 중간 값과 찾을 값을 비교한다.
 * 		  비교 결과 찾을 값이 크면, 중간 값을 기준으로 뒤쪽에서 찾는다.
 *		  찾을 값이 작으면, 중간 값을 기준으로 앞쪽에서 찾는다.
 *		 값이 동일하면 인덱스를 리턴하고 값이 없으면 -1을 리턴하며 찾기를 종료한다.
 */
public class BinaryTree {

	static int search2(int [] a, int start, int end, int value) {
		
		while(start<=end) {
			//반복문을 사용하기때문에 재귀 호출은 필요 없음!
			int middle = (start+end)/2;
			if(a[middle]>value) end=middle-1;
			else if(a[middle]<value) start=middle+1;
			else return middle;
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Search2 : 이예지");
		
		int [] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

		System.out.println(search2(a, 0,a.length-1, 11));
		System.out.println(search2(a, 0,a.length-1, 15));
		System.out.println(search2(a, 0,a.length-1, -1));
	}

}
