package AlgoMedium;

import java.util.List;

public class MoveElementToEnd {

  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {

    int lastPosition=array.size()-1;
    int currentPosition=0;

    while(currentPosition<lastPosition){
      if(array.get(currentPosition)==toMove){
        while(array.get(lastPosition)==toMove){
          if(lastPosition==0||lastPosition<=currentPosition){
            return array;
          }
          --lastPosition;
        }
        int temp=array.get(lastPosition);
        array.set(lastPosition,array.get(currentPosition));
        array.set(currentPosition,temp);
        --lastPosition;
      }
      ++currentPosition;
    }

    return array;
  }

}
