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
		Node newNode = new Node(data);
		if(root == null){
			return newNode;
		}
		
		if(curr.data > data){
		    curr.left = insert(curr.left,data);
		}
		else if(curr.data < data){
		    curr.right = insert(curr.right,data);
		}
		return curr;
	}
}
