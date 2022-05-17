package Algos;

import java.util.ArrayList;
import java.util.List;

public class P876MiddleOfLinkedList {

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

  }

  public static ListNode middleNode(ListNode head) {

    List<ListNode> nodelist = new ArrayList<ListNode>();

    int numberOfElements = 0;

    ListNode node=head;

    while(node!=null){
      nodelist.add(node);
      ++numberOfElements;
      node=node.next;
    }

    int middleNum = (int) Math.ceil(numberOfElements/2);

    return nodelist.get(middleNum);

  }
}

/*

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

 */