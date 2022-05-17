package directGraphAdjacencyList;

public class DoublyLinkedList<T> {

	public class Node{
		public T  data;
		public Node previousNode;
		public Node nextNode;
	}
	
	
	public Node headNode;
	
	public Node tailNode;
	
	public int size;
	
	
	public DoublyLinkedList() {
		this.headNode=null;
		this.tailNode=null;
	}
	
	
	public boolean isEmpty() {
		if(headNode==null && tailNode == null) 
			return true;
		return false;
	}
	
	
	public Node getHeadNode() {
		return headNode;
	}


	public Node getTailNode() {
		return tailNode;
	}


	public int getSize() {
		return size;
	}
	

	public void insertAtHead(T data) {
		// TODO Auto-generated method stub
		
	}
	
	public void insertAtEnd(T data) {
		// TODO Auto-generated method stub
		
	}
	
	public void deleteAtHead() {
		
	}
	
	
    public void deleteAtTail() {
		
	}
	
    
    public void printList() {
    	
    }
    
    public void printListReverse() {
    	
    }
	

}
