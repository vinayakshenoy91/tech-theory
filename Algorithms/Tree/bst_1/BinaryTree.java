package bst_1;

//Iterative impl-BST
public class BinaryTree {

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

		if (isEmpty()) {
			this.root = new Node(value);
			return true;
		}

		Node currentNode = root;

		while (currentNode != null) {
			Node leftChild = currentNode.getLeftChild();
			Node rightChild = currentNode.getRightChild();

			if (currentNode.getData() > value) {
				if (leftChild == null) {
					leftChild = new Node(value);
					currentNode.setLeftChild(leftChild);
					return true;
				}
				currentNode = leftChild;
			} else {

				if (rightChild == null) {
					rightChild = new Node(value);
					currentNode.setRightChild(rightChild);
					return true;
				}
				currentNode = rightChild;
			}

		}

		return false;

	}
	
	//Just for Testing purpose 
	public void printTree(Node current) 
    {
		if (current == null) return;

		System.out.print(current.getData() + ",");
		printTree(current.getLeftChild());
		printTree(current.getRightChild());

	}

}
