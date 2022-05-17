package singlyLinkedList;



//Insert at end and insert after is demoed
class BasicsDemo {
    public static void main( String args[] ) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.printList();
        for (int i = 1; i <= 10; i++) {
			sll.insertAtEnd(i);
			sll.printList();
        }
        
        sll.insertAfter(14, 10);
        sll.printList();
        
       // System.out.println(sll.searchNode(21));
        
        sll.deleteByValue(1);
        sll.printList();
        
        
    }
}