package midTest2;

class Node {
	int value;
	Node left;
	Node right;
	
	public Node(int value) {
		this.value = value;
		this.left=null;
		this.right=null;
	}
	
	public void add(int value) {
		if(value < this.value) {
			if(left==null) left=new Node(value);
			left.add(value);
		}
		else if(value > this.value) {
			if(right==null) right= new Node(value);
			right.add(value);
		}
	}
	
	public void print() {
		if(left!=null) left.print();
		System.out.printf("%d ", value);
		if(right!=null) right.print();
	}
	
	public boolean contains(int value) {
		if(this.value==value) return true;
		else if(this.value > value) {
			return (left!=null) && left.contains(value);
		}
		else {
			return (right!=null) && right.contains(value);
		}
	}
	
	public int getLeftMostValue() {
		if(left!=null) return this.left.getLeftMostValue();
		return value;
	}

	public void remove(int value, Node p) {
		//1. 값이 있는 곳을 찾는다 2. 삭제할 값의 자식 유무를 판단한다.
		if(value<this.value) {
			if(this.left!=null)this.left.remove(value, this);
		}
		else if(value>this.value) {
			if(this.right!=null)this.right.remove(value, this);
		}
		else { //삭제할 값을 찾음!
			if(left!=null&& right!=null) {
				int temp = this.right.getLeftMostValue();
				this.value = temp;
				right.remove(temp, this);
			}
			else {
				Node child = (left!=null)? left : right;
				if(p.left==this) p.left = left;
				else p.right = right;
			}
			
		}
	}
}
public class Example13 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] a = {  5, 25, 3, 15, 23, 30, 8, 17, 22, 24 };
			Node root = new Node(20);
			for(int i=0; i<a.length; i++) {
				root.add(a[i]);
			}
			root.print();
			System.out.println();
			//root.remove(20, root); 13번
			//root.print();
			root.remove(25, root); //14번
			root.print();
		}
}

