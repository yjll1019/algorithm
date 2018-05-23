package example1;
/*
 * �ۼ��� : 2018�� 05�� 22��
 * �� �� : ���� �����ϴ� �迭 
 * 		�ð� ���⵵ add : O(1) / remove,contains : O(n) �� ã�Ƽ� �����ϰ� �� ������ ��������. 
 * 		 ���� ���⵵ O(1) >> �迭�� �� ����ŭ �迭�� �����ϱ� ������ .
 */
public class Example1B {
	
	static class MyArray{
		int[] a;
		int count; //�迭�� ���� ����� ������ ++ ������ ������ --
		
		public MyArray(int size) {
			a = new int[size];
			count = 0;
		}
		
		public void add(int value) {
			a[count] = value;
			++count;
		}
		
		public int findIndex(int value) { //����ִ� ���� �ε��� ����
			for(int i=0; i<a.length; i++) {
				if(a[i]==value) return i;
			}
			return -1; //���� ���� ��
		}
		
		public void remove(int value) {
			int index = findIndex(value);
			if(index==-1) return;
			for(int i=index; i<a.length-1; ++i) {
				a[i]=a[i+1];
			}
			count--;
		}
		
		public boolean contains(int value) {
			return (findIndex(value)!=-1); //-1 : �� ���� , ��  ��(�ε���): �� ���� 
		}
	
		public int get(int index) {
			return a[index];
		}
	}
	
	public static void main(String[] args) {
		int maxValue=200, maxCount=10;
		
		MyArray myArray = new MyArray(maxCount);
		
		int[] data = { 1, 13, 105, 7, 9, 11, 14, 115, 107, 197 };
        for (int i = 0; i < data.length; ++i)
            myArray.add(data[i]);
        
        for(int i=0; i<maxCount; ++i) {
        	System.out.println(myArray.get(i));
        }
	}
	
}
