/*
 * This condition is VVIP in alll algos: temp.getData()!=data && temp.getNextNode()!=null
 * 
 * 
 */

package singlyLinkedList;

public class SinglyLinkedList<T> {

	public class Node {

		private T data;

		private Node nextNode;

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

	}

	private Node headNode;

	private int size;

	public SinglyLinkedList() {
		this.setHeadNode(null);
		this.setSize(0);
	}

	public boolean isEmpty() {

		return this.getHeadNode() == null;

	}

	public void insertAtHead(T data) {

		Node tempNode = new Node();
		tempNode.setData(data);

		tempNode.setNextNode(this.getHeadNode());
		this.setHeadNode(tempNode);
		++size;

	}

	public void insertAtEnd(T data) {

		Node tempNode = new Node();
		tempNode.setData(data);

		Node temp = headNode;

		if (isEmpty()) {
			this.setHeadNode(tempNode);
			return;
		}

		while (temp.getNextNode() != null) {
			temp = temp.getNextNode();
		}

		temp.setNextNode(tempNode);
		++size;

	}

	public void insertAfter(T data, T previous) {

		Node temp = this.getHeadNode();

		if (temp == null) {
			return;
		}

		while (temp.getData() != previous && temp.getNextNode() != null) {

			temp = temp.getNextNode();

		}

		if (temp.getData() == previous) {
			Node tempNode = temp.getNextNode();

			Node newNode = new Node();
			newNode.setData(data);
			newNode.setNextNode(tempNode);

			temp.setNextNode(newNode);
			++size;
		}
	}

	public boolean searchNode(T data) {

		Node tempNode = this.getHeadNode();

		if (tempNode == null) {
			return false;
		}

		while (tempNode.getData() != data && tempNode.getNextNode() != null) {
			tempNode = tempNode.getNextNode();
		}

		if (tempNode.getData() == data) {
			return true;
		}

		return false;

	}

	// Helper Function to printList
	public void printList() {
		if (isEmpty()) {
			System.out.println("List is Empty!");
			return;
		}

		Node temp = headNode;
		System.out.print("List : ");
		while (temp.nextNode != null) {
			System.out.print(temp.data.toString() + " -> ");
			temp = temp.nextNode;
		}
		System.out.println(temp.data.toString() + " -> null");
	}

	// Deletes data from the head of list
	public void deleteAtHead() {
		// if list is empty then simply return
		if (isEmpty())
			return;
		// make the nextNode of the headNode equal to new headNode
		headNode = headNode.nextNode;
		size--;
	}

	public void deleteByValue(T data) {

		Node temp = this.getHeadNode();
		
		if(temp==null){
			return;
		}
		
		//Check for head node	
		if(temp.getData()==data) {
			this.setHeadNode(temp.getNextNode());
			--size;
			return;
		}
		

		//Check for other nodes
		while (temp.getNextNode() != null) {

			if(temp.getNextNode().getData()==data) {
				temp.setNextNode(temp.getNextNode().getNextNode());
				--size;
				return;
			}
			temp=temp.getNextNode();
		}
	

	}

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getLength() {
		int count=0;

		Node temp=this.getHeadNode();
		
		while(temp!=null) {
			System.out.println(temp.data);
			++count;
			temp=temp.getNextNode();
		}
		
		return count;
	}
	
	public void reverse(SinglyLinkedList<T> list){
		
		
		
		
		
	}

}
