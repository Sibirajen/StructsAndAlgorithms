package BinarySearchTree;

class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
		this.left = this.right = null;
	}
}

public class BinarySearchTree {
	Node root;
	
	//BST insert
	public void insert(int data) {
		root = insert(root,data);
	}
	
	private Node insert(Node curr,int data){
		if(curr == null){
			return new Node(data);
		}
		
		if(curr.data > data){
		    curr.left = insert(curr.left,data);
		}
		else if(curr.data < data){
		    curr.right = insert(curr.right,data);
		}
		return curr;
	}
	
	//BST delete
	public void delete(int data) {
		root = delete(root,data);
	}
	
	private Node delete(Node curr,int data) {
		if(curr == null) {
			return curr;
		}
		
		if(curr.data > data) {
			curr.left = delete(curr.left,data);
		}
		else if(curr.data < data) {
			curr.right = delete(curr.right,data);
		}
		else {
			if(curr.left == null) {
				return curr.right;
			}
			if(curr.right == null) {
				return curr.left;
			}
			
			Node succ = getInOrderSucc(curr);
			curr.data = succ.data;
			curr.right = delete(curr.right,succ.data);
		}
		return curr;
	}
	
	
	//method to get the inOrder successor
	private Node getInOrderSucc(Node curr) {
		curr = curr.right;
		while(curr.left != null && curr != null) {
			curr = curr.left;
		}
		return curr;
	}
	
	//BST print tree
	public void printTree() {
		printTree(root);
		System.out.println();
	}
	
	private void printTree(Node curr) {
		if(curr == null) {
			return;
		}
		
		printTree(curr.left);
		
		System.out.print(curr.data+" ");
		
		printTree(curr.right);
	}
}
