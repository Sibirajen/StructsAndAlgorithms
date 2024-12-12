package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree BST = new BinarySearchTree();
		BST.insert(50);
		BST.insert(30);
		BST.insert(70);
		BST.insert(20);
		BST.insert(40);
		BST.insert(60);
		BST.insert(80);
		
		BST.printTree();
		BST.delete(20);
		BST.printTree();
		BST.delete(70);
		BST.printTree();
		BST.delete(50);
		BST.printTree();
		
		BST.find(60);
		BST.find(10);
	}
}
