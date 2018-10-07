package greedy;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 10�� 07��
 * �� �� : ���
 */
public class Code_1080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.nextLine();
		
		char[][] a = new char[n][m];
		char[][] b = new char[n][m];
		boolean[][] c = new boolean[n][m];
		int cnt=0;
		int compare = 0;
		
		//���A �Է�
		for(int i=0; i<n; ++i) {
			a[i] = sc.nextLine().toCharArray();
		}
		

		//���B �Է�
		for(int i=0; i<n; ++i) {
			b[i] = sc.nextLine().toCharArray();
			for(int j=0; j<m; ++j) {
				if(a[i][j]!=b[i][j]) {
					c[i][j] = true;
					compare++;
				}
			}
		}
		
		if(compare==0) {//���A�� ���B�� ���Ұ� ��� ���� ���
			System.out.println(0);
			System.exit(0);
		}
		if(n<3 || m<3) {
			System.out.println(-1);
			System.exit(0);
		}
		
		for(int i=0; i<=n-3; ++i) {
			for(int j=0; j<=m-3; ++j) {
				 if (i == n - 3 && !(c[i][j] == c[i + 1][j] && c[i][j] == c[i + 2][j])) {
						System.out.println(-1);
						System.exit(0);
				}
				 if (j == m - 3 && !(c[i][j] == c[i][j + 1] && c[i][j] == c[i][j + 2]))	{	
						System.out.println(-1);
						System.exit(0);
				}
				if(i==n-3&&j == m - 3) {
					if(false==(c[i][j]==c[i+1][j+1] && c[i+1][j+1]==c[i+1][j+2] && c[i+1][j+2]==c[i+2][j+1] && c[i+2][j+1]==c[i+2][j+2])) {
						System.out.println(-1);
						System.exit(0);
					}
				}
				if(c[i][j]==true) { //true > false�� �ٲ��ֱ�
					cnt++;
					for(int x=i; x<=i+2; ++x) {
						for(int z=j; z<=j+2; ++z) {
							c[x][z]=!c[x][z];
						}
					}
				}
				
			}
		}

		System.out.println(cnt);		
			
	}
}
