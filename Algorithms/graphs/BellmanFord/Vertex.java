package BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

  private String name;
  private boolean visisted;
  private double distance = Double.MAX_VALUE;
  private Vertex previousVertex;
  private List<Edge> adjacencies;

  private Vertex(String name) {
    this.name = name;
    this.adjacencies = new ArrayList<>();
  }

  public void addNeighbour(Edge e) {
    this.adjacencies.add(e);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isVisisted() {
    return visisted;
  }

  public void setVisisted(boolean visisted) {
    this.visisted = visisted;
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public Vertex getPreviousVertex() {
    return previousVertex;
  }

  public void setPreviousVertex(Vertex previousVertex) {
    this.previousVertex = previousVertex;
  }

  public List<Edge> getAdjacencies() {
    return adjacencies;
  }

  public void setAdjacencies(List<Edge> adjacencies) {
    this.adjacencies = adjacencies;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
