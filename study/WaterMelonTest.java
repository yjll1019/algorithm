package study;
/*
 * 작성일 : 2018년 05월 07일
 * 내 용 : 프로그래머스 - 수박수박수박수? 참고
 */
public class WaterMelonTest {
	
		public String watermelon(int n) {
		      StringBuilder str = new StringBuilder();
		      String s ="수박";
		         for(int i=0; i<n/2; ++i){
		           str.append(s);
		          if(n%2==1){
		             str.append(s.charAt(0));
		          }
		        }
		      return str.toString();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterMelonTest wm = new WaterMelonTest();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}

}
