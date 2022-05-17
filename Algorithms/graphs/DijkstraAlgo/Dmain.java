package DijkstraAlgo;

public class Dmain {

  public static void main(String[] args) {

    Vertex vertex0 = new Vertex("A");
    Vertex vertex1 = new Vertex("B");
    Vertex vertex2 = new Vertex("C");

    vertex0.addNeighbour(new Edge(1, vertex0, vertex1));
    vertex1.addNeighbour(new Edge(3, vertex0, vertex2));
    vertex2.addNeighbour(new Edge(1, vertex1, vertex2));

    Dijkstra algo = new Dijkstra();

    algo.computePath(vertex0);

    System.out.println(algo.getShortestPathTo(vertex0));
  }
}
