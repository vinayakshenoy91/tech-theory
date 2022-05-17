package directGraphAdjacencyList;

public class Graph {

	 int vertices;
	 
	 //adjacencyList to store an array of linked lists. 
	 //Each index of the array represents a vertex of the graph, and the linked list represents the adjacent vertices.
	 DoublyLinkedList<Integer> adjacencyList[];
	 
	 
	 
	 @SuppressWarnings("unchecked")
	 public Graph(int vertices) {
		 this.vertices=vertices;
		 adjacencyList = new DoublyLinkedList[vertices];
		 
		 for( int i=0;i<vertices;i++) {
			 
			 adjacencyList[i] = new DoublyLinkedList<Integer>();
		 }
		 
		 
	 }
	 
	 void addEdge(int source, int destination) {
		
		 if(source<vertices && destination<vertices) {
			 adjacencyList[source].insertAtEnd(destination);
			
			 //If undirected then use
			 // adjacencyList[source].insertAtEnd(destination);
			 
			 
		 }
		 
	 }
	 
	 
	 
	 void printGraph(){
		 
		 System.out.println(">>Adjacency list of directed graph<<");
		 
		 for(int i=0;i<vertices;i++) {
			 
			 if(adjacencyList[i]!=null) {
				 System.out.print("|"+i+"|=>");
				 
				 DoublyLinkedList<Integer>.Node temp = adjacencyList[i].getHeadNode();
				 
				 while(temp!=null) {
					 System.out.println("["+temp.data+"]->");
					 temp=temp.nextNode;
				 }
				 System.out.println("null");
				 
			 }else {
				 System.out.println("|"+i+"|=>"+"null");
			 }	 
		 }
			 
	 }
	 
}


