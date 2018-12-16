package bruteForce;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 12�� 16��
 * �� �� : ���ٲ���
 */
public class Code_1697 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //�������� ��ġ
		int m = sc.nextInt(); //������ ��ġ
		
		boolean[] check = new boolean[1000000];
		int[]  dist = new int[1000000];
		check[n] = true;
		dist[n] = 0;
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		
		while(!q.isEmpty()) {
			int now = q.remove();//���� �������� ��ġ
			if(now-1 >= 0) {
				if(check[now-1]==false) { //�湮 ������ ������
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
