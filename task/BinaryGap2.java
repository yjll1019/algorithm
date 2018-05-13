package task;

/*
 * �ۼ��� : 2018�� 05�� 13��
 * �� �� : codility lesson1 Iterations ���� - �ð� ���⵵ O(1)����!
 * 		��) 1001 �̸� ���̳ʸ� ���� ���̰� 2
 * 		529�� �������� 1000010001 �̹Ƿ� ���̳ʸ� ���� ���̰� 4
 * 		20�� ��������  10100�̹Ƿ� ���̳ʸ� ���� ���̰� 1
 * 		15�� ��������  1111�̹Ƿ� ���̳ʸ� ���� ���̰� 0�̴�
 *		solution�޼ҵ��� �Ű������� ���� ������ �Է��ϸ� ���̳ʸ� ���� ���̸� �����ϴ� �޼ҵ� �ۼ�.
 */

public class BinaryGap2 {

		static public int solution(int n) {
			String a = Integer.toBinaryString(n);
			System.out.print(n+"�� �������� : "+a);
			int k=1;
			int count=0;
			int max=0;
			int oneCount=0;
			while(k<32) { //int�� ������ 2�� 31���������̱� ������ 32�̸����� for���� ������.
				if((n&(1<<(k-1))) != 0 ) { //n�� k������ �ڸ��� 0�̾ƴϸ� >> 1�̸� 
					if(oneCount%2==0) { //Ȧ�� : ���� �ʴ� 
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
			System.out.println("task_BinaryGap : �̿���");
			System.out.println(" >> 4�� BinaryGap ���� : "+ solution(4));
			System.out.println(" >> 9�� BinaryGap ����  : "+ solution(9));
			System.out.println(" >> 1041�� BinaryGap ����  : "+ solution(1041));
			System.out.println(" >> 8488�� BinaryGap ����  "+ solution(8489));
			System.out.println(" >> 1181825�� BinaryGap ���� "+ solution(1181825));
			
		}

	}
