package binaryTree;


class Node{
	int value;
	Node leftChild;
	Node rightChild;
	
	public Node(int value) {
		this.value = value;
		leftChild = null;
		rightChild = null;
	}
	
	public void add(int value) {
		if(this.value > value) {
			if(this.leftChild != null) this.leftChild.add(value);
			else this.leftChild = new Node(value);
		}
		else if(this.value < value) {
			if(this.rightChild != null) this.rightChild.add(value);
			else this.rightChild = new Node(value);
		}
	}
	
	public void print() { //Inorder Traversal
		if(this.leftChild!=null) this.leftChild.print();
		System.out.print(this.value+" ");
		if(this.rightChild!=null) this.rightChild.print();
	}
	
	public boolean contains(int value) {
		if(this.value > value) return (this.leftChild!=null) && (this.leftChild.contains(value));
		else if(this.value < value) return (this.rightChild!=null) && (this.rightChild.contains(value));
		return true;
	}
	
	public void remove(int value, Node parent) {
		System.out.println("remove "+this.value);
		if(this.value > value) {
			if(this.leftChild!=null) this.leftChild.remove(value, this);
		}
		else if(this.value < value) {
			if(this.rightChild!=null) this.rightChild.remove(value, this);
		}
		else {
			if(this.leftChild!=null && this.rightChild!=null) {
				int temp = this.rightChild.getLeftMostValue();
				this.value= temp;
				this.rightChild.remove(temp, this);
			}
			else {
				Node child = (this.leftChild!=null)? leftChild : rightChild;
				if(parent.leftChild == this) parent.leftChild = child;
				else parent.rightChild = child;
			}
		}
	}
	
	public int getLeftMostValue() {
		if(this.leftChild!=null) return this.leftChild.getLeftMostValue();
		return this.value;
	}
}

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 18, 1, 12, 7, 2, 14, 6, 9, 15 }; 
		Node root = new Node(10); 
		for (int i = 0; i < a.length; ++i)
			root.add(a[i]);
		root.print();
		System.out.println();
		System.out.println("contains 5 : "+root.contains(5));
		System.out.println("contains 100 : "+root.contains(100));
		root.remove(5, root);
		root.print();
		System.out.println();
		root.add(5);
		root.print();
		System.out.println();
		root.remove(15, root);
		root.print();
		System.out.println();
	}

}
