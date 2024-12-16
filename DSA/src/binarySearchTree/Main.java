package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		
		tree.printTree();
		tree.delete(20);
		tree.printTree();
		tree.delete(70);
		tree.printTree();
		tree.delete(50);
		tree.printTree();
		
		tree.find(60);
		tree.find(10);
	}
}
