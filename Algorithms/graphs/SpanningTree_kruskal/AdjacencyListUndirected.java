package SpanningTree_kruskal;

import java.util.ArrayList;
import java.util.List;

/*
 * 0 1 2
 * 1 0 2 3
 * 2 0 1
 * 3 1
 * 
 */

public class AdjacencyListUndirected {

	public static void main(String[] args) {

		int v = 5;

		List<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);

		for (int i = 0; i < v; i++) {
			adj.add(new ArrayList<Integer>());
		}

		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);

		adj.stream().forEach((item) -> {
			if (adj.indexOf(item) != adj.size() - 1) {
				System.out.print("(" + adj.indexOf(item) + ")");
				item.stream().forEach(i -> {
					System.out.print("->"+i );
				});
				System.out.println("\n");
			}
		});

	}

	private static void addEdge(List<ArrayList<Integer>> adj, int i, int j) {

		adj.get(i).add(j);
		adj.get(j).add(i);

	}

}
