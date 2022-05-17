package CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

  private String name;
  private boolean visited;
  private boolean isBeingVisited;
  private List<Vertex> neighbours;

  public Vertex(String name){
    this.name=name;
    this.neighbours= new ArrayList<>();
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

  public boolean isBeingVisited() {
    return isBeingVisited;
  }

  public void setBeingVisited(boolean beingVisited) {
    isBeingVisited = beingVisited;
  }

  public List<Vertex> getNeighbours() {
    return neighbours;
  }

  public void setNeighbours(List<Vertex> neighbours) {
    this.neighbours = neighbours;
  }

  public void addNeighbours(Vertex v) {
    this.neighbours.add(v);
  }

  @Override
  public String toString() {
    return name;
  }
}
