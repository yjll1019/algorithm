package task;
/*
 * 작성일 : 2018년 04월 29일
 * 내 용 : 예) 1001 이면 바이너리 갭의 길이가 2
 * 			529는 이진수로 1000010001 이므로 바이너리 갭의 길이가 4와 3
 * 			20은 이진수로  10100이므로 바이너리 갭의 길이가 1
 * 			15는 이진수로  1111이므로 바이너리 갭의 길이가 0이다
 *			solution메소드의 매개변수로 양의 정수를 입력하면 바이너리 갭의 길이를 리턴하는 메소드 작성.
 */

// 1. 이진수로 바꾸기  2.양쪽이 1 1인지 3. 그 안의 연속된 0이 몇개인지 
// 4
public class BinaryGap {

	static public int solution(int n) {
		String a = Integer.toBinaryString(n); //이진수로 변환
		int count = 0;
		int max = 0 ;
		System.out.println(n+"은 "+a);
		if(a.charAt(0)=='0' || a.charAt(a.length()-1)=='0') return 0;
		
		for(int i=0; i<a.length()-1; i++) {
			if(a.charAt(i)=='0') count++;
			else {
				max = (max>count)? max : count; 
				count = 0;
			}
		}
		return (max>count)? max : count;
	}
	
	static void tttt(String n) {
		int a = Integer.parseInt(n,2);
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("task_BinaryGap : 이예지");
		System.out.println("4일 때 : "+ solution(4));
		System.out.println("9일 때 : "+ solution(9));
		System.out.println("1041일 때 : "+ solution(1041));
		System.out.println("8488일 때 : "+ solution(8489));
		System.out.println("1181825일 때 : "+ solution(1181825));
	}

}
