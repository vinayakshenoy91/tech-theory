package com.graph.DFS;

import java.util.List;

public class DFSRecursion {


	public void dfs(List<Vertex> vertexList) {

		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				dfsRecursive(v);
			}
		}

	}
	
	private void dfsRecursive(Vertex v) {
		
		System.out.println(v+" ");
		
		for(Vertex vertex : v.getNeighbourList()) {
			if (!vertex.isVisited()) {
				vertex.setVisited(true);
				dfsRecursive(vertex);
			}
		}
		
		
	}


}
