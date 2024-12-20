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
	
//	This method will get the balance factor of the current node
	private int getBalanceFactor(Node n) {
		if(n == null) {
			return 0;
		}
		return getHeight(n.left) - getHeight(n.right);
	}
	
//	This method will get the current height of the node
	private int getHeight(Node n) {
		if(n == null) {
			return 0;
		}
		return n.height;
	}
	
//  Right rotation
//			 z                                      y 
//       	/ \                                   /   \
//  	   y   T4      Right Rotate (z)          x      z
// 		  / \          - - - - - - - - ->      /  \    /  \ 
//		 x   T3                               T1  T2  T3  T4
//      / \
//    T1   T2
	public Node rightRotate(Node z) {
		Node y = z.left;
		Node T3 = y.right;
		
		y.right = z;
		z.left = T3;
		
		z.height = 1 + Math.max(getHeight(z.left), getHeight(z.right));
		y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
		
		return y;
	}

	
//  Left rotation	
//	   z                                y
//	  /  \                            /   \ 
//	 T4   y     Left Rotate(z)       z      x
//	     /  \   - - - - - - - ->    / \    / \
//	    T3   x                     T4  T3 T2  T1
//	        / \
//	      T2  T1
	public Node leftRotate(Node z) {
		Node y = z.right;
		Node T3 = y.left;
		
		y.left = z;
		z.right = T3;
		
		z.height = 1 + Math.max(getHeight(z.left), getHeight(z.right));
		y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
		
		return y;
	}
	
//	This is perform rotation and calling leftRotate and rightRotate
	private Node performRotation(Node curr,int data) {
		curr.height = 1 + Math.max(getHeight(curr.left), getHeight(curr.right));
		
		int bf = getBalanceFactor(curr);
		
		if(bf > 1 && data < curr.left.data) {
//			Right rotation
			return rightRotate(curr);
		}
		if(bf < -1 && data > curr.right.data) {
//			Left rotation
			return leftRotate(curr);
		}
		if(bf > 1 && data > curr.left.data) {
//			left-right rotation
			curr.left = leftRotate(curr.left);
			return rightRotate(curr);
		}

		if(bf < -1 && data < curr.right.data) {
//			right-left rotation
			curr.right = rightRotate(curr.right);
			return leftRotate(curr);
		}
		
		return curr;
	}
	
	
//	This is the insertion method
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
		
		return performRotation(curr,data);
	}
	
//	This is to get the inOrder successor
	private Node getSuccessor(Node curr) {
		curr = curr.right;
		while(curr != null && curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}
//	This is delete node method
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
			
			Node succ = getSuccessor(curr);
			curr.data = succ.data;
			curr.right = delete(curr.right,succ.data);
		}
		return performRotation(curr,data);
	}
	
//	This is to search the data
	public void find(int data) {
		Node node = find(root,data);
		if(node != null) {
			System.out.println("Data found");
		}else {
			System.out.println("Data Not found");
		}
	}
	
	private Node find(Node curr,int data) {
		if(curr == null || curr.data == data) {
			return curr;
		}
		
		if(curr.data > data) {
			return find(curr.left,data);
		}
		return find(curr.right,data);
	}
	
//	This is to perform traversal
	public void inOrder() {
		inOrder(this.root);
		System.out.println();
	}
	private void inOrder(Node curr) { 
        if (curr != null) {  
            inOrder(curr.left);
            System.out.print(curr.data + " ");
            inOrder(curr.right); 
        }
    }
}
