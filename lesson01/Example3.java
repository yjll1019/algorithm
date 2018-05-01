package lesson01;
/*
 * 작성일자 : 2018년 03월 18일
 * 내 용 : 반복문과 재귀호출을 이용한 Node출력.
 */
public class Example3 {
	
	static class Node{
		int value;
		Node next;
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		public void printAll() {
			//반복문을 이용해서 출력
			Node p = this;
			while(p!=null) {
				System.out.printf("%d ", p.value);
				p = p.next;
			}
		
		}
		
		public void printAllRecursive() {
			//매개변수 없이 재귀 호출을 이용해서 출력.>> 나 
			
			if(this.next==null) {
				System.out.printf("%d ", this.value);
				return ;
			}
			System.out.printf("%d ", this.value);
			this.next.printAllRecursive();
		}
		
		public void printAllRecursive2() {
			//매개변수 없이 재귀 호출을 이용해서 출력. >> 교수님
			System.out.printf("%d ", this.value);
			if(this.next!=null) this.next.printAllRecursive2();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example3: 이예지");
		Node root = null;
		for(int i=1; i<=10; ++i) {
			root = new Node(i, root);
		}
		
		System.out.print("printAll()메소드 : ");
		root.printAll();
		System.out.println();
		
		System.out.print("printAllRecursive()메소드 : ");
		root.printAllRecursive();
		
		System.out.println();
		System.out.print("printAllRecursive2()메소드 : ");
		root.printAllRecursive();
		
		
	}

}
