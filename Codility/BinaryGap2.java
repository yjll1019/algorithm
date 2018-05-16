package task;

/*
 * 작성일 : 2018년 05월 13일
 * 내 용 : codility lesson1 Iterations 참고 - 시간 복잡도 O(1)구현!
 * 		예) 1001 이면 바이너리 갭의 길이가 2
 * 		529는 이진수로 1000010001 이므로 바이너리 갭의 길이가 4
 * 		20은 이진수로  10100이므로 바이너리 갭의 길이가 1
 * 		15는 이진수로  1111이므로 바이너리 갭의 길이가 0이다
 *		solution메소드의 매개변수로 양의 정수를 입력하면 바이너리 갭의 길이를 리턴하는 메소드 작성.
 */

public class BinaryGap2 {

		static public int solution(int n) {
			String a = Integer.toBinaryString(n);
			System.out.print(n+"를 이진수로 : "+a);
			int k=1;
			int count=0;
			int max=0;
			int oneCount=0;
			while(k<32) { //int형 정수가 2의 31제곱까지이기 때문에 32미만으로 for문을 돌린다.
				if((n&(1<<(k-1))) != 0 ) { //n의 k번쨰의 자리가 0이아니면 >> 1이면 
					oneCount++;
					if(oneCount%2==0) { //1의 개수가 짝수이면 max랑 count랑 비교해서 max에 넣기
					max = (max < count)? count :max;
					count=0;
					oneCount=1;
					}
				}
				else {
					count++;
				}
				k++;
			}
			
			return max;
		}

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("task_BinaryGap : 이예지");
			System.out.println(" >> 4의 BinaryGap 길이 : "+ solution(4));
			System.out.println(" >> 9의 BinaryGap 길이  : "+ solution(9));
			System.out.println(" >> 1041의 BinaryGap 길이  : "+ solution(1041));
			System.out.println(" >> 8488의 BinaryGap 길이  "+ solution(8489));
			System.out.println(" >> 1181825의 BinaryGap 길이 "+ solution(1181825));
			
		}

	}
