package task;

import java.util.Scanner;

/*
 * �ۼ����� : 2018�� 03�� 10��
 * �� �� : ��� ȣ���� �̿��ؼ� binaryTree add�޼ҵ带 �����Ѵ�.
 */

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ȣ���� �̿��� ����Ʈ�� add�޼ҵ�");
	
		BinaryTree t = new BinaryTree();
		Scanner input = new Scanner(System.in);
		
		int num;
			
			do {
			System.out.println();
			System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
			System.out.println("1. ���  2. �߰�  3.����");
			num = input.nextInt();
			
				switch(num) {
				case 1: System.out.println("���� ��ȸ�� �����մϴ�.");
						t.print();
				break;
				case 2: System.out.println("�߰��� ������ �Է����ּ���.");
						int value = input.nextInt();
						t.add(value);
				break;
				case 3: System.out.println("���α׷��� �����մϴ�.");			
				break;
				default : System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");
				break;
				}
			
			}	while(num!=3);
		
	}

}
