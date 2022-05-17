package DijkstraAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

  public List<Vertex> getShortestPathTo(Vertex targetVertex) {

    List<Vertex> shortestPathToTarget = new ArrayList<>();

    Vertex vertex = targetVertex;

    while (vertex != null) {
      shortestPathToTarget.add(vertex);
      vertex = vertex.getPredecessor();
    }

    Collections.reverse(shortestPathToTarget);
    return shortestPathToTarget;
  }

  public void computePath(Vertex sourceVertex) {
    sourceVertex.setDistance(0);
    PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
    priorityQueue.add(sourceVertex);

    while (!priorityQueue.isEmpty()) {

      Vertex actualVertex = priorityQueue.poll();

      for (Edge e : actualVertex.getAdjacencyList()) {
        Vertex v = e.getTargetVertex();

        double newDistance = actualVertex.getDistance() + e.getWeight();

        if (newDistance < v.getDistance()) {
          priorityQueue.remove(v);
          v.setDistance(newDistance);
          v.setProdecessor(actualVertex);
          priorityQueue.add(v);
        }
      }
    }
  }
}
