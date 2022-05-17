package DataStructureAlgo.Graphs.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public void traverse(Vertex root) {

        Queue<Vertex> queue = new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()) {

            Vertex actualVertex = queue.remove();

            System.out.println("Actual visited vertex " + actualVertex);

            for (Vertex v : actualVertex.getAdjacencyList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }

        }

    }

}