package divideConquer;

import java.util.Scanner; 
/*
 * �ۼ��� : 2018�� 10�� 19��
 * �� �� : ����Ʈ��
 */
public class Code_1992 {

	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ���� ũ��� 2*2=4
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.nextLine();
		
		arr = new int[n][n];

		//0�� 1�� �Է¹��� �� �迭�� ����.
		for(int i=0; i<n; ++i) {
			String s = sc.nextLine();
			for(int j=0; j<n; ++j) {
				arr[i][j] = s.charAt(j)-'0';
			}
		}
		
		function(0, 0, n);
		System.out.println(sb.toString());
	}
	
	static void function(int row, int col, int n) {	
		
		boolean same = true;
		
		for(int i=row; (i<row+n) && same; ++i) { //������ ������ �� ������ Ȯ���ϱ� ���� for��
			for(int j=col; (j<col+n) && same; ++j) {
				if(arr[i][j] != arr[row][col])
					same = false;
			}
		}
		
		if(same) {
			sb.append(arr[row][col]);
		}else {
			sb.append("(");
			function(row, col, n/2); //���� ��
			function(row, col+(n/2), n/2); //������ ��
			function(row+(n/2), col, n/2); //���� �Ʒ�
			function(row+(n/2), col+(n/2), n/2);//������ �Ʒ�
			sb.append(")");
		}
		
	}
	

	
}
