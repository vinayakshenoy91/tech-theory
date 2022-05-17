package Tree.BST;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

  private Node<T> root;


  @Override
  public void insert(T data) {

    if (root == null) {
      this.root = new Node<>(data, null);
    } else {
      insert(data, root);
    }
  }

  private void insert(T data, Node<T> node) {

    if (data.compareTo(node.getValue()) < 0) {
      if (node.getLeftNode() != null) {
        insert(data, node.getLeftNode());
      } else {
        node.setLeftNode(new Node<>(data, node));
      }
    } else if (data.compareTo(node.getValue()) > 0) {
      if (node.getRightNode() != null) {
        insert(data, node.getRightNode());
      } else {
        node.setRightNode(new Node<>(data, node));
      }
    }
  }

  @Override
  public void remove(T data) {
    if (root == null) {
      return;
    }
    remove(data, root);
  }

  private void remove(T data, Node<T> node) {

    if (node == null) {
      return;
    }

    if (data.compareTo(node.getValue()) < 0) {
      remove(data, node.getLeftNode());
    } else if (data.compareTo(node.getValue()) > 0) {
      remove(data, node.getLeftNode());
    } else {

      //WE HAVE FOUND ITEM WE WANT TO REMOVE!!!

      // if the node is a leaf node
      if (node.getLeftNode() == null && node.getRightNode() == null) {

        Node<T> parent = node.getParentNode();

        if (parent != null && parent.getLeftNode() == node) {
          parent.setLeftNode(null);
        } else if (parent != null && parent.getRightNode() == node) {
          parent.setRightNode(null);
        }

        //Root node is the one we want to remove
        if (parent == null) {
          root = null;
        }

        // remove the node and make it eligible for GC
        node = null;
      }

      //case2 : remove items with single child
      else if (node.getLeftNode() == null && node.getRightNode() != null) {
        Node<T> parent = node.getParentNode();

        if (parent != null && parent.getLeftNode() == node) {
          parent.setLeftNode(node.getRightNode());
        } else if (parent != null && parent.getRightNode() == node) {

          parent.setRightNode(node.getRightNode());
        }

        if (parent != null) {
          root = node.getRightNode();
        }

        //Update right child parent
        node.getRightNode().setParentNode(parent);
        node = null;
      } else if (node.getLeftNode() != null && node.getRightNode() == null) {

        Node<T> parent = node.getParentNode();

        if (parent != null && parent.getLeftNode() == node) {
          parent.setLeftNode(node.getLeftNode());
        } else if (parent != null && parent.getRightNode() == node) {

          parent.setRightNode(node.getLeftNode());
        }

        if (parent != null) {
          root = node.getLeftNode();
        }

        //Update right child parent
        node.getLeftNode().setParentNode(parent);
        node = null;
      } else {
        //Remove two children [Mathematical reduction] - bring predecessor as root node
        Node<T> predecessor = getPredecessor(node.getLeftNode());

        T temp = predecessor.getValue();

        predecessor.setValue(node.getValue());

        node.setValue(temp);

        remove(data,predecessor);
      }
    }
  }

  private Node<T> getPredecessor(Node<T> leftNode) {

    Node<T> node = leftNode;

    while (node.getRightNode() != null) {
      node = node.getRightNode();
    }

    return node;
  }


  @Override
  public void traversal() {

    if (root == null) {
      return;
    }

    traversal(root);
  }

  private void traversal(Node<T> node) {

    if (node.getLeftNode() != null) {
      traversal(node.getLeftNode());
    }

    System.out.println(node + " - ");

    if (node.getRightNode() != null) {
      traversal(node.getRightNode());
    }
  }

  @Override
  public T getMin() {
    Node tempRoot = root;

    if (tempRoot == null) {
      return null;
    }

    while (tempRoot.getLeftNode() != null) {
      tempRoot = tempRoot.getLeftNode();
    }

    return ((T) tempRoot.getValue());
  }

  @Override
  public T getMax() {
    Node tempRoot = root;

    if (tempRoot == null) {
      return null;
    }

    while (tempRoot.getRightNode() != null) {
      tempRoot = tempRoot.getRightNode();
    }

    return ((T) tempRoot.getValue());
  }
}
