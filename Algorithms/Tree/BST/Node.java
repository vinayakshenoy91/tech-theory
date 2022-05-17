package Tree.BST;

public class Node<T> {

  private T data;
  private Node<T> leftNode;
  private Node<T> rightNode;
  //Required when implementing remove method
  private Node<T> parentNode;

  public Node(T value, Node<T> parentNode) {
    this.data = value;
    this.parentNode = parentNode;
  }

  public T getValue() {
    return data;
  }

  public void setValue(T value) {
    this.data = value;
  }

  public Node<T> getLeftNode() {
    return leftNode;
  }

  public void setLeftNode(Node<T> leftNode) {
    this.leftNode = leftNode;
  }

  public Node<T> getRightNode() {
    return rightNode;
  }

  public void setRightNode(Node<T> rightNode) {
    this.rightNode = rightNode;
  }

  public Node<T> getParentNode() {
    return parentNode;
  }

  public void setParentNode(Node<T> parentNode) {
    this.parentNode = parentNode;
  }

  @Override
  public String toString() {
    return " "+ data ;
  }
}


