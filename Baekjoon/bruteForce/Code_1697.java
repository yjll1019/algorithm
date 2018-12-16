package bruteForce;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 작성일 : 2018년 12월 16일
 * 내 용 : 숨바꼭질
 */
public class Code_1697 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //수빈이의 위치
		int m = sc.nextInt(); //동생의 위치
		
		boolean[] check = new boolean[1000000];
		int[]  dist = new int[1000000];
		check[n] = true;
		dist[n] = 0;
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		
		while(!q.isEmpty()) {
			int now = q.remove();//현재 수빈이의 위치
			if(now-1 >= 0) {
				if(check[now-1]==false) { //방문 경험이 없으면
					q.add(now-1);
					check[now-1] = true;
					dist[now-1] = dist[now]+1;
				}
			}
			
			if(now+1<1000000) {
				if(check[now+1]==false) {
					q.add(now+1);
					check[now+1]=true;
					dist[now+1]=dist[now]+1;
				}
			}
			
			if(now*2<1000000) {
				if(check[now*2]==false) {
					q.add(now*2);
					check[now*2] = true;
					dist[now*2] = dist[now]+1;
				}
			}
		}
		
		System.out.println(dist[m]);
	}
	
}
