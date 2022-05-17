package DataStructureAlgo.Graphs.BFS;

public class App {

    public static void main(String[] args) {

        BFS bfs = new BFS();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addNeighbours(b);
        a.addNeighbours(f);
        a.addNeighbours(g);

        b.addNeighbours(a);
        b.addNeighbours(c);
        b.addNeighbours(d);

        c.addNeighbours(b);

        d.addNeighbours(b);
        d.addNeighbours(e);

        f.addNeighbours(a);

        g.addNeighbours(a);
        g.addNeighbours(h);

        h.addNeighbours(g);

        bfs.traverse(a);

    }

}