package singlyLinkedList;



//Insert at end and insert after is demoed
class LengthOfLinkedList {
    public static void main( String args[] ) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.printList();
        for (int i = 1; i <= 10; i++) {
			sll.insertAtEnd(i);
			sll.printList();
        }

        
        
        System.out.println(sll.getLength());
       
        
        
    }
}