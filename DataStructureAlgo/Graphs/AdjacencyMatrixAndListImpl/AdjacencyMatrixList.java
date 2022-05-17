package DataStructureAlgo.Graphs.AdjacencyMatrixAndListImpl;

public class AdjacencyMatrixList {

    private static int[][] matrix = { { 0, 2, 4, 0 }, { 0, 0, 0, 3 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

    public static void main(String[] args) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("Edge with weight is " + matrix[i][j]);
                }
            }
        }

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");

        a.addNeighbour(b);

        a.showNeighbour();

    }

}