package avlTree;

class Node{
	int data, height;
	Node left, right;
	Node(int data){
		this.data = data;
		this.left = this.right = null;
		this.height = 1;
	}
}

public class AVLTree {
	Node root;
	
	//This method will get the balance factor of the current node
	private int getBalanceFactor(Node n) {
		if(n == null) {
			return 0;
		}
		return getHeight(n.left) - getHeight(n.right);
	}
	
	//This method will get the current height of the node
	private int getHeight(Node n) {
		if(n == null) {
			return 0;
		}
		return n.height;
	}
	
	//insert method
	public void insert(int data) {
		this.root = insert(root,data);
	}
	private Node insert(Node curr,int data) {
		if(curr == null) {
			return new Node(data);
		}
		
		if(curr.data < data) {
			curr.right = insert(curr.right,data);
		}
		else if(curr.data > data){
			curr.left = insert(curr.left,data);
		}
		else {
			System.out.println("Data already exists");
			return curr;
		}
		
		curr.height = 1 + Math.max(getHeight(curr.left), getHeight(curr.right));
		
		int bf = getBalanceFactor(curr);
		
		return curr;
	}
}
