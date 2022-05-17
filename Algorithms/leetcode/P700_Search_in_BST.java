package Algos;

public class P700_Search_in_BST {

  public static void main(String[] args) {

    System.out.println(Math.round(3.27));

  }

  private static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }


  public static TreeNode searchBST(TreeNode root, int val) {

    TreeNode node = root;

    while (node != null) {
      if (node.val == val) {
        return node;
      } else if (val < node.val) {
        node = node.left;
      } else if (val > node.val) {
        node = node.right;
      }
    }

    return node;
  }
}


/*

Recursion :

class Solution {
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null || val == root.val) return root;

    return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
  }
}

Iteration:

  public TreeNode searchBST(TreeNode root, int val) {
    while (root != null && val != root.val)
      root = val < root.val ? root.left : root.right;
    return root;
  }
}


 */