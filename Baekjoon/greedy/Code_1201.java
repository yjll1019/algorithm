package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 10�� 06��
 * �� �� : NMK - 1���� N������ ���� �� ���� �̿��ؼ� �ִ� �κ� ���� ������ ���̰� M�̰�, 
 * 				�ִ� �κ� ���� ������ ���̰� K�� ������ ���.
 */
public class Code_1201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
	
		List<Integer> list = new ArrayList<Integer>();
		

		if( m+k-1 <= n || n <= m*k)  {
			for(int i=k; i>=1; --i) {
				list.add(i); // 2 1 ��
			}
			for(int t : list)
				System.out.print(t+" ");
			
			int x = ((n-k/(m-1))%2==0? (n-k)/(m-1):(n-k)/(m-1)+1); //����� Ȧ���� +1;
			
			list = new ArrayList<Integer>();
			
			int count = 0;
			
			for(int i=1; i<=n-k; ++i) {
				if(i%x==0) {
					count++;
					if(count==m-1) {
						list.add(i+k);
					}else {
					list.add(i+k);
					Collections.reverse(list);
					for(int t : list)
						System.out.print(t+" ");
					list = new ArrayList<Integer>();

				}
				}else {
					list.add(i+k);
				
				}
			}
			
			Collections.reverse(list); //������ �� add
			for(int t : list)
				System.out.print(t+" ");

		}else {
			System.out.println(-1);
		}

	}

}
