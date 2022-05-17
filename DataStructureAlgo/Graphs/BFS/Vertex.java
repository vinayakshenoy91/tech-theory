package DataStructureAlgo.Graphs.BFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> adjacencyList;

    public Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
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

    public void addNeighbours(Vertex v) {
        this.adjacencyList.add(v);
    }

    public List<Vertex> getAdjacencyList() {
        return this.adjacencyList;
    }

    @Override
    public String toString() {
        return this.name;
    }

}