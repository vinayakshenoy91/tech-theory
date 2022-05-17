package InOrderTraversal;

public class inOrder {



		public static void inTraverse(Node root) {

			if (root == null) return;

			inTraverse(root.getLeftChild());
			System.out.print(root.getData() + ",");
			inTraverse(root.getRightChild());

		}

		public static void main(String[] args) {

			binarySearchTree BST = new binarySearchTree();

			BST.add(6);
			BST.add(4);
			BST.add(9);
			BST.add(5);
			BST.add(8);
			BST.add(12);
			BST.add(2);

			inTraverse(BST.getRoot());

		}




}
