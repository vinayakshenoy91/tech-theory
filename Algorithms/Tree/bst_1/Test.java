package bst_1;

public class Test {

	public static void main(String[] args) {
		BinaryTreeRecursive bsT = new BinaryTreeRecursive();

		bsT.add(6);
		bsT.add(4);
		bsT.add(9);
		bsT.add(5);
		bsT.add(2);
		bsT.add(8);
		bsT.add(12);
		bsT.add(10);
		bsT.add(14);
    
		bsT.printTree(bsT.getRoot());
	}

}
