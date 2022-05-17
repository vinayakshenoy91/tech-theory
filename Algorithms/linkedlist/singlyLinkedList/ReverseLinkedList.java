package singlyLinkedList;

//Insert at end and insert after is demoed
class ReverseLinkedList<T> {

	
    public static void main( String args[] ) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.printList();
        for (int i = 1; i <= 10; i++) {
			sll.insertAtEnd(i);
        }
        
        reverse(sll);
        
        sll.printList();
   
       
    }
    
    public static <T> void reverse(SinglyLinkedList<T> list){
        

    	
    	if(list.getHeadNode()==null) {
    		return;
    	}
    	
    	
    	SinglyLinkedList<T>.Node current =list.getHeadNode();
    	
    	SinglyLinkedList<T>.Node previous = null;
    	
     	SinglyLinkedList<T>.Node next = null;
    	
    	
    	while(current !=null) {
    		
    		next = current.getNextNode();
    		
    		current.setNextNode(previous);
    		
    		previous = current;
    		current =next;
    		
    	}
    	
    	list.setHeadNode(previous);
    	
    	
    }

	
}