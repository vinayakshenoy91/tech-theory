package Algos;


/*

public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
        if (current.next.val == current.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return head;
}
 */

public class P83RemoveDuplicatesFromSortedList {

  private static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static void main(String[] args) {

    ListNode head = new ListNode(1);

    head.next = new ListNode(1);
    head.next.next = new ListNode(2);

    ListNode output=deleteDuplicates(head);


    while(output!=null){

      System.out.println(output.val);

      output=output.next;
    }

  }

  public static ListNode deleteDuplicates(ListNode head) {

    ListNode node = head;

    if (node == null) {
      return node;
    }

    while (node != null) {
      while (true) {
        if (node != null && node.next != null && node.val == node.next.val) {
          node.next = node.next.next;
        } else {
          break;
        }
      }

      node = node.next;
    }

    return head;
  }
}



