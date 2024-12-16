package avlTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLTree tree = new AVLTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(25);
		
		tree.inOrder();
	}

}
