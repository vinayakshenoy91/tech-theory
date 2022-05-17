package BellmanFord;

import java.util.List;

public class BellmanFord {

  private List<Edge> edgelist;
  private List<Vertex> vertexList;

  public BellmanFord(List<Edge> edgelist, List<Vertex> vertexList) {
    this.edgelist = edgelist;
    this.vertexList = vertexList;
  }

  public void bellmanFord(Vertex startVertex) {

    startVertex.setDistance(0);

    for (int i = 0; i < vertexList.size() - 1; i++) {

      for (Edge edge : edgelist) {

        if (edge.getStartVertex().getDistance() == Double.MAX_VALUE) {
          continue;
        }
        double newDistance = edge.getStartVertex().getDistance() + edge.getWeight();

        if (newDistance < edge.getEndVertex().getDistance()) {
          edge.getEndVertex().setDistance(newDistance);
          edge.getEndVertex().setPreviousVertex(edge.getStartVertex());
        }
      }

      for (Edge edge : edgelist) {

        if (edge.getStartVertex().getDistance() != Double.MAX_VALUE) {
          if (hasCycle(edge)) {
            System.out.println("Cycle is a negative cycle detected");
            return;
          }
        }
      }
    }
  }

  private boolean hasCycle(Edge edge) {
    return edge.getStartVertex().getDistance() + edge.getWeight() < edge.getEndVertex()
        .getDistance();
  }


  public void shortestPath(Vertex targetVertex) {
    if (targetVertex.getDistance() == Double.MAX_VALUE) {
      System.out.println("There is no path from source to target");
    }

    Vertex actualVertex = targetVertex;

    while (actualVertex.getPreviousVertex() != null) {
      System.out.println(actualVertex + " - ");
      actualVertex = actualVertex.getPreviousVertex();
    }
  }
}
