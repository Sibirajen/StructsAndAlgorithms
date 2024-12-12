package treeTraversal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//      4
		//     / \   
		//    2   6
		//   /\   /\
		//  1  3 5  7
		TreeTraversal BST = new TreeTraversal();
		BST.insert(4);
		BST.insert(2);
		BST.insert(6);
		BST.insert(1);
		BST.insert(3);
		BST.insert(5);
		BST.insert(7);
		
		System.out.print("InOrder ");
		BST.inOrder();
		
		System.out.print("PreOrder ");
		BST.preOrder();
		
		System.out.print("PostOrder ");
		BST.postOrder();
		
		System.out.print("LevelOrder ");
		BST.levelOrder();
	}
}
