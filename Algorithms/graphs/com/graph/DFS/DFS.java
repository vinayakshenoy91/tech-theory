package com.graph.DFS;

import java.util.List;
import java.util.Stack;

public class DFS {

	private Stack<Vertex> stack;

	public DFS() {
		this.stack = new Stack<Vertex>();
	}

	public void dfs(List<Vertex> vertexList) {

		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				dfsWithStack(v);
			}
		}

	}

	private void dfsWithStack(Vertex rootVertex) {
		// TODO Auto-generated method stub
		this.stack.add(rootVertex);
		rootVertex.setVisited(true);

		while (!stack.isEmpty()) {
			Vertex actualVertex = this.stack.pop();
			System.out.println(actualVertex + " ");

			for (Vertex v : actualVertex.getNeighbourList()) {

				if (!v.isVisited()) {
					v.setVisited(true);
					this.stack.push(v);
				}

			}
		}

	}

}
