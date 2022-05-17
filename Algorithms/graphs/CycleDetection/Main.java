package CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Vertex v0= new Vertex("A");
    Vertex v1=new Vertex("B");
    Vertex v2= new Vertex("C");
    Vertex v3=new Vertex("D");
    Vertex v4= new Vertex("E");
    Vertex v5 = new Vertex("F");

    v0.addNeighbours(v2);
    v0.addNeighbours(v4);
    v2.addNeighbours(v1);
    v2.addNeighbours(v3);
    v4.addNeighbours(v5);
    v5.addNeighbours(v0);



    List<Vertex> graph = new ArrayList<>();
    graph.add(v0);
    graph.add(v1);
    graph.add(v2);
    graph.add(v3);
    graph.add(v4);
    graph.add(v5);

    CycleDetection detect = new CycleDetection();
    detect.detectCycles(graph);





  }

}
