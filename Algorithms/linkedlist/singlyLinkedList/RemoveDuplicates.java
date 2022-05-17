package singlyLinkedList;

import java.util.HashSet;
import java.util.Set;

//Insert at end and insert after is removed
class RemoveDuplicates<T> {

	
    public static void main( String args[] ) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
			sll.insertAtEnd(i);
        }
        
        sll.insertAfter(10, 5);
        
     System.out.println("Before duplicate removal:");
        
        sll.printList();
        
        removeDuplicates(sll);
        
        System.out.println("After duplicate removal:");
        
        sll.printList();
   

    }
    
    public static <T> void removeDuplicates(SinglyLinkedList<T> list){
    	
    
    	Set<T> set = new HashSet<>();
    	
    	
    	if(list.getHeadNode()==null) {
    		return;
    	}
    	
    	SinglyLinkedList<T>.Node temp = list.getHeadNode();
    	

    	set.add(temp.getData());
    	
    	while(temp!=null && temp.getNextNode()!=null) {
    		
    		
    		if(set.contains(temp.getNextNode().getData())) {
    			temp.setNextNode(temp.getNextNode().getNextNode());
    		}else {
    			set.add(temp.getData());
    		}
    		
    		temp=temp.getNextNode();
    		
    	}
    	
    }

	
}