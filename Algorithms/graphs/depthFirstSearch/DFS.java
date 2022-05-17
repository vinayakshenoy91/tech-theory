package depthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {
	
	private Stack<Vertex> stack;
	
	
	public DFS() {
		this.stack = new Stack<Vertex>();
	}
	
	//Reuired to visit if it is clustered
	public void dfs(List<Vertex> vertexList) {
		for(Vertex v: vertexList) {
			if(!v.isVisited()) {
				v.setVisited(true);
                dfsWithStack(v);//dfsRecursive(vertex);
			}
		}
	}
	
	public void dfsRecursive(Vertex v) {
		for(Vertex vertex : v.getNeighbourList()) {
			if(!vertex.isVisited()) {
				vertex.setVisited(true);
				dfsRecursive(vertex);
			}
		}
	}
	

	private void dfsWithStack(Vertex rootVertex) {
		// TODO Auto-generated method stub
		this.stack.add(rootVertex);
		rootVertex.setVisited(true);
		
		while(!this.stack.isEmpty()) {
		  
			 Vertex actualVertex = this.stack.pop();
			 System.out.print(actualVertex+" ");
			 
			 for(Vertex v : actualVertex.getNeighbourList()) {
				 if(!v.isVisited()) {
					 v.setVisited(true);
					 this.stack.push(v);
				 }
			 }
			
		}
		
	}

}
