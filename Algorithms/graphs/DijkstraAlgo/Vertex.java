package DijkstraAlgo;

import java.util.ArrayList;
import java.util.List;


public class Vertex implements Comparable<Vertex> {

  private String name;
  private boolean visited;

  private List<Edge> adjacencyList;
  private double distance;

  private Vertex predecessor;

  public Vertex(String name) {
    this.name = name;
    this.adjacencyList = new ArrayList<>();
    this.distance = Double.MAX_VALUE;
  }


  public void addNeighbour(Edge e) {
    this.adjacencyList.add(e);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isVisited() {
    return visited;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public List<Edge> getAdjacencyList() {
    return adjacencyList;
  }

  public void setAdjacencyList(List<Edge> adjacencyList) {
    this.adjacencyList = adjacencyList;
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public Vertex getPredecessor() {
    return predecessor;
  }

  public void setProdecessor(Vertex prodecessor) {
    this.predecessor = prodecessor;
  }

  @Override
  public int compareTo(Vertex otherVertex) {
    return Double.compare(this.distance, otherVertex.getDistance());
  }
}
