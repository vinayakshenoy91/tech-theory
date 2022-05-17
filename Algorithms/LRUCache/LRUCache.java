package LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

  private int actualSize;

  private Map<Integer,Node> map;

  private DoublyLinkedList linkedList;

  public LRUCache(){
    this.map=new HashMap<Integer, Node>();
    this.linkedList=new DoublyLinkedList();
  }

}
