package DataStructureAlgo.Graphs.AdjacencyMatrixAndListImpl;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;

    private List<Vertex> adjacencyList;


    public Vertex(String name){
        this.name=name;
        this.adjacencyList= new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex){
        adjacencyList.add(vertex);
    }

    public void showNeighbour(){
        for(Vertex v: adjacencyList){
            System.out.println(v);
        }
    }

    @Override
    public String toString() {
        return name;
    }
    
}