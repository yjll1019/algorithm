package lesson01;

/*
 * 작성일자 : 2018년 03월 18일 일요일
 * 내 용 : 반복문, 재귀호출을 이용한 Node객체 추가
 */
public class Example4 {

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
		
		public void addTail(int value) {
			//반복문 이용
			Node p = this;
			while(p.next!=null) {
				p = p.next;
			}
			p.next = new Node(value,null);
		}
		
		public void addTailRecursive(int value) {
			//재귀호출 이용
			
			if(this.next!=null) this.next.addTailRecursive(value);
			else this.next = new Node(value, null);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exapmle4 : 이예지");
		
		Node root = new Node(0, null);
		
		for(int i=1; i<=10; ++i) {
			root.addTail(i);
		}
		
		System.out.print("addTail메소드 호출 결과: ");
		root.printAll();
		
		System.out.println();
		
		Node root2 = new Node(0,null);
		
		System.out.print("addTailRecursive메소드 호출 결과: ");
		
		for(int i=1; i<=10; ++i) {
			root2.addTailRecursive(i);
		}
		
		root2.printAll();
	}

}
