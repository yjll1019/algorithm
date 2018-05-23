package example1;
/*
 * �ۼ��� : 2018�� 05�� 22��
 * �� �� : ������ �ؽ� ���̺� �ۼ�.
 * 		�ð� ���⵵(add,remove,contains) O(1), ���� ���⵵ O(n) >> ���� ���� ���ϴ�.
 */
public class Example1A {
	static class HashTable{
		int[] a;
		
		public HashTable(int n) { //1~200������ ������ �����ҰŶ�� 201ũ���� �迭 ����
			a = new int[n+1];
		}
		
		public void add(int value) {
			a[value] = value;
		}
		
		public void remove(int value) {
			a[value] = 0;
		}
		
		public boolean contains(int value) {
			return a[value]==value;
		}
		
	}
	
	public static void main(String[] args) {
		int maxValue=200, maxCount=10;
		HashTable hashTable = new HashTable(maxValue);
		
		int[] data = { 1, 13, 105, 7, 9, 11, 14, 115, 107, 197 };
		
		for(int i=0; i<data.length; ++i)
			hashTable.add(data[i]);
		
		for(int i=1; i<=maxValue; ++i) { //�ؽ����̺� �ִ� �� ���
			if(hashTable.contains(i))
				System.out.println(i);
		}
	}
}
