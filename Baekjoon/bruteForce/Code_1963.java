package bruteForce;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 작성일 : 2018년 12월 16일
 * 내 용 : 소수경로 - 숨바꼭질과 유사! 
 */
public class Code_1963 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean[] prime = new boolean[10001];
		for(int i=2; i<=10000; ++i) { //합성수이면 true
			if(prime[i]==false) {
				for(int j=i*i; j<=10000; j+=i) {
					prime[j] = true;
				}
			}
		}
		
		for(int i=0; i<prime.length; ++i) {
			prime[i] = !prime[i]; //합성수이면 false
		}
		
		int n = sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			String[] s = sc.nextLine().split(" ");
			boolean[] check = new boolean[10001];
			int[] dist = new int[10001];
			dist[Integer.parseInt(s[0])] = 0;
			check[Integer.parseInt(s[0])] = true;
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(Integer.parseInt(s[0]));
			
			while(!q.isEmpty()) {
				int now = q.remove();
				for(int i=0; i<4; ++i) {
					for(int j=0; j<=9; ++j) {
						int next = change(now,i,j);
						if(next!=-1) {
							if(prime[next] && check[next]==false) {//소수이고 방문 경험이 없으면
								q.add(next);
								dist[next] = dist[now]+1;
								check[next] = true;
							}
						}
					}
				}
			}
			System.out.println(dist[Integer.parseInt(s[1])]);
		}
	}
	
	//현재 수의 idx위치의 수를 j로 바꿈.
	public static int change(int num, int idx, int j) {
		if(idx == 0 && j==0) {
			return -1;
		}
		
		String s = Integer.toString(num);
		
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(idx, (char)(j+'0'));
		return Integer.parseInt(sb.toString());
	}

}
