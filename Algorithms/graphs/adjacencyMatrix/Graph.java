package adjacencyMatrix;

import java.util.ArrayList;
import java.util.List;

public class Graph {

  int[][] adjacencyMatrix;

  List<GraphNode> list = new ArrayList<>();

  public  Graph(ArrayList<GraphNode> list){
    this.list=list;

    adjacencyMatrix=new int[list.size()][list.size()];
  }

  public void addUndirectedEdge(int i, int j){
    adjacencyMatrix[i][j]=1;
    adjacencyMatrix[j][i]=1;
  }


}
