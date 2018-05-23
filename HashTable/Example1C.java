package example1;
/*
 * �ۼ��� : 2018�� 05�� 22��
 * �� �� : ������ �ؽ� ���̺� ����.
 *  	�迭�� ũ�⸦ 37�� ���� ��, 37�� ���� �������� ��ġ�� ���� ����.
 *  	������ ���� �ߺ����� �ʱ� ������ ����. ���� �ϳ��� �ߺ��Ǵ� ���� ������ ����� �۵����� ����.
 * 		�ð� ���⵵(add,remove,contains) O(1), ���� ���⵵ O(1) 
 */
public class Example1C {
	
	static class HashTable{
		
		int[] a;
		
		public HashTable() {
			a = new int[37];
		}
		
		public void add(int value) {
			a[value%37] = value;
		}
		
		public void remove(int value) {
			a[value%37] = 0;
		}
		
		public boolean contains(int value) {
			return a[value%37]==value; //���� ������ true ���� ������ �迭 �� ���Ұ� 0�̱� ������ false����.
		}
	}
	
	public static void main(String[] args) {
		int maxValue=200, maxCount=10;
		HashTable hashTable = new HashTable();
		
        int[] data = { 1, 13, 105, 7, 9, 11, 14, 115, 107, 197 };
		
		for(int i=0; i<data.length; ++i) {
			hashTable.add(data[i]);
		}
		
		for(int i=1; i<=maxCount; ++i) { //1~200������ ������ �ִ´ٰ� �����Ͽ����Ƿ�
			if(hashTable.contains(i))   //1~200���� �� ���� ������ ���
				System.out.println(i);
		}
	}
}
