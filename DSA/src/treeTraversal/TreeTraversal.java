package treeTraversal;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
		this.left = this.right = null;
	}
}

public class TreeTraversal{
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
	
	//InOrder traversal *left->parent->right*
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	private void inOrder(Node curr) {
		if(curr == null) {
			return;
		}
		inOrder(curr.left);
		System.out.print(curr.data+" ");
		inOrder(curr.right);
	}
	
	//PreOrder traversal *parent->left->right*
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	private void preOrder(Node curr) {
		if(curr == null) {
			return;
		}
		System.out.print(curr.data+" ");
		preOrder(curr.left);
		preOrder(curr.right);
	}
	
	//PostOrder traversal *left->right->parent*
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	private void postOrder(Node curr) {
		if(curr == null) {
			return;
		}
		postOrder(curr.left);
		postOrder(curr.right);
		System.out.print(curr.data+" ");
	}
	
	//levelOrder traversal prints level wise
	public void levelOrder() {
		Queue<Node> queue = new LinkedList<>();
		Node node = root;
		if(node == null) {
			return;
		}
		
		queue.add(node);
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			System.out.print(curr.data+" ");
			if(curr.left != null) {
				queue.add(curr.left);
			}
			if(curr.right != null) {
				queue.add(curr.right);
			}
		}
		System.out.println();
	}
}
