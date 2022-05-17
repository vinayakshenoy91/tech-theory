package bst_1;

//Iterative impl- BST
public class BinaryTreeRecursive {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return root == null;
	}
	
	
	public boolean add(int value) {
		this.root=recursiveInsert(this.root, value);
		return true;
	}

	public Node recursiveInsert(Node currentNode, int value) {

		if (currentNode == null) {
			return new Node(value);
		}

		if (currentNode.getData() > value) {
			currentNode.setLeftChild(recursiveInsert(currentNode.getLeftChild(), value));
		} else if (currentNode.getData() < value) {
			currentNode.setRightChild(recursiveInsert(currentNode.getRightChild(), value));
		} else {
			return currentNode;
		}
		
		return currentNode;

	}

	// Just for Testing purpose
	public void printTree(Node current) {
		if (current == null)
			return;

		System.out.print(current.getData() + ",");
		printTree(current.getLeftChild());
		printTree(current.getRightChild());

	}

}
