package KruskalAlgo;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
	
	private int nodeCount=0;
	private int setCount=0;
	private List<Node> rootNodes;
	
	public DisjointSet(List<Vertex> vertices) {
		this.rootNodes = new ArrayList<Node>(vertices.size());
		makeSets(vertices);
	}

	private void makeSets(List<Vertex> vertices) {
		// TODO Auto-generated method stub
		
		for(Vertex v: vertices) {
			makeSet(v);
		}
		
		
	}

	private void makeSet(Vertex v) {
		Node n = new Node(0,rootNodes.size(),null);
		v.setNode(n);
        rootNodes.add(n);
        setCount++;
        nodeCount++;
	}

}
