//Another approach: https://www.algoexpert.io/questions/Sum%20of%20Linked%20Lists

package Algos.LinkedList;

import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }



  public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
    // Write your code here.

    int firstNum=0;
    int secondNum=0;

    int multiplier=1;
    LinkedList tempNode=null;
    do{
      firstNum+=multiplier*linkedListOne.value;
      multiplier*=10;
      tempNode=linkedListOne;
      linkedListOne=linkedListOne.next;
    }while(tempNode.next!=null);

    multiplier=1;

    do{
      secondNum+=multiplier*linkedListTwo.value;
      multiplier*=10;
      tempNode=linkedListTwo;
      linkedListTwo=linkedListTwo.next;
    }while(tempNode.next!=null);

    int sum= firstNum+secondNum;

    LinkedList prev=null;

    Stack<Integer> stack = new Stack<Integer>();

    while(sum/10!=0){
      int rem=sum%10;
      stack.add(rem);
      sum=sum/10;
    }
    stack.add(sum);

    while(!stack.isEmpty()){
      if(prev==null){
        prev= new LinkedList(stack.pop());
      }else{
        LinkedList ll= new LinkedList(stack.pop());
        ll.next=prev;
        prev=ll;
      }

    }


    return prev;
  }
}
