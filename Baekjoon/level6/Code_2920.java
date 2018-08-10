package level6;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 10일
 * 내 용 : 음계
 */
public class Code_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[8];
		
		for(int i=0; i<8; ++i) {
			arr[i] = sc.nextInt();
		}
		
		String result="mixed";//오름차순도아니고 내림차순도 아닐 때
		boolean b = true;
		int a = arr[0];
		
		if(a==1) { //오름 차순일 경우
			for(int i=1; i<arr.length; ++i) {
				if(arr[i]==arr[i-1]+1)
					continue;
				else {
					b = false;
					break;
				}
			}
			if(b==true)result="ascending";
		}else if(a==8) {//내림 차순일 경우
			for(int i=0; i<arr.length-1; ++i) {
				if(arr[i+1]+1==arr[i])
					continue;
				else {
					b = false;
					break;
				}
			}
			if(b==true)result="descending";
		}
			
		System.out.println(result);
	}
}
