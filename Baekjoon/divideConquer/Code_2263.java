package divideConquer;

import java.util.Scanner;

/*
 * 작성일 : 2018년 10월 17일
 * 내 용 : 트리의 순회
 */
public class Code_2263 {
	
	static int[] inOrder;
	static int[] postOrder;
	static int[] position=new int[100001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		inOrder = new int[n];
		postOrder = new int[n];
		
		for(int i=0; i<n; ++i) {
			inOrder[i] = sc.nextInt();
		}

		for(int i=0; i<n; ++i) {
			postOrder[i] = sc.nextInt();
		}
		
		//숫자들의 위치 저장.
		for(int i=0; i<n; ++i) {
			position[inOrder[i]] = i; 
		}
		
		function(0, n-1, 0, n-1);
				
	}
	
	static void function(int start, int end, int postStart, int postEnd) {
		if(start>end || postStart>postEnd)
			return;
		int root = postOrder[postEnd];
	//	System.out.println(start+" "+end+" "+postStart+" "+postEnd);
		System.out.print(root+" ");
		
		int p = position[root]; //root는 inOrder의 p에 있음.
		
		int left = p - start; //왼쪽 범위
		
		function(start, p-1, postStart, postStart+left-1);
		//0, 3 , 0 , 2
		function(p+1, end, postStart+left, postEnd-1);
		//4, 6 , 3, 5
		
	}
	
}
