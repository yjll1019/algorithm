package study;
/*
 * �ۼ����� : 2018�� 03�� 29��
 * �� �� : ���� ��ҹ��ڿ� ����� �̷���� ���忡�� �ܾ��� ������ ���ϴ� �ڵ� �ۼ�.(����1152 ����)
 */
public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("study_Word : �̿���");
		String s = "The Curious Case of Benjamin Button";
		
		String []a = s.split(" ");
		
		System.out.println("�ܾ��� ���� :"+a.length);
	}
	//split �޼��� : �Ű������� regex�� �����Ͽ� �� �������� ��Ʈ���� ���� String[] Ÿ������ �����ϴ� �޼���.
}
