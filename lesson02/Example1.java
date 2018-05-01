package lesson02;

import java.util.Random;

/*
 * 작성일자 : 2018년 03월 23일
 * 내 용 : 이진트리의 contains 메소드 구현.
 */

public class Example1 {
	
	static class Node{
		int value;
		Node left;
		Node right;
	
		public Node(int value) {
			this.value=value;
			this.left=left;
			this.right = right;
		}
		
		public void add(int value) {
			//O(log n)
			if(value < this.value) {
				if(left==null) left=new Node(value);
				else left.add(value);
			}
			else if(value > this.value){
				if(right==null) right = new Node(value);
				else right.add(value);
			}
		}
		
		public boolean contains(int value) {
			//O(log n)
			boolean result = false;
			
			if(this.value==value) return true;
			else if(this.value > value) {
				if(left==null) return false;
				else result=left.contains(value);
			}
			else if(this.value < value) {
				if(right==null) return false;
				else result=right.contains(value);
			}
			
			return result;
		}
		
		public boolean contains2(int value) {
			if(value<this.value) return left!=null && left.contains2(value);
			else if(value>this.value) return right!=null && right.contains2(value);
			return true;//value == this.value >> true !
		}
		
		public void print() {
			//중위순회 방식으로 노드 출력
			if(left != null) left.print();
			System.out.printf("%d ", value);
			if(right != null) right.print();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example1 : 이예지");
		
		Random random = new Random();
		
		Node root = new Node(random.nextInt(20));
		
		for(int i=0; i<15; ++i) {
			root.add(random.nextInt(20));
		}//만약에 같은 값이 들어가게 되면 노드에 1추가가 되지 않으므로 출력결과가 16개가 아니다.
		
		root.print();

		System.out.println();
		
		for(int i=0; i<20; ++i) {
			int value = random.nextInt(20);
			System.out.printf("%d : %s\n", value, root.contains2(value));
		}
	
	}	

}
