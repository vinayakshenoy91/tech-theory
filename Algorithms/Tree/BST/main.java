package Tree.BST;

public class main {

  public static void main(String[] args) {
    BinarySearchTree newBinarySearchTree = new BinarySearchTree();

    newBinarySearchTree.insert(12);
    newBinarySearchTree.insert(4);
    newBinarySearchTree.insert(20);
    newBinarySearchTree.insert(1);
    newBinarySearchTree.insert(8);
    newBinarySearchTree.insert(16);
    newBinarySearchTree.insert(27);

    newBinarySearchTree.remove(16);

    newBinarySearchTree.traversal();




  }

}
