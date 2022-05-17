package CycleDetection;

import java.util.List;

public class CycleDetection {

  public void detectCycles(List<Vertex> graph){

     for(Vertex v : graph){
       if(!v.isVisited()){
         dfs(v);
       }
     }
  }


  private void dfs(Vertex v){
    v.setBeingVisited(true);
    for(Vertex p : v.getNeighbours()  ){
      if(p.isBeingVisited()){
        System.out.println("Cycle is present");
        return;
      }

      if(!p.isVisited()){
        p.setVisited(true);
        dfs(p);
      }

    }

    v.setBeingVisited(false);
    v.setVisited(true);
  }
}
