package AlgoMedium;

import java.util.HashMap;
import java.util.Map;

public class MatchingBrackets {

  public static boolean balancedBrackets(String str) {

    String[] arr = str.split("");

    int movingIndex=-1;
    int currentIndex=0;

    String[] tempArr= new String[str.length()];

    Map<String,String> map = new HashMap<>();
    map.put("{","}");
    map.put("[","]");
    map.put("(",")");

    while(currentIndex<str.length()){

      if(arr[currentIndex].contains("[")||
          arr[currentIndex].contains("]")||
          arr[currentIndex].contains("{")||
          arr[currentIndex].contains("}")||
          arr[currentIndex].contains("(")||
          arr[currentIndex].contains(")")){


        if(movingIndex!=-1&&map.get(tempArr[movingIndex])!=null && map.get(tempArr[movingIndex]).equals(arr[currentIndex])){
          tempArr[movingIndex]=null;
          --movingIndex;
        }else{
          tempArr[++movingIndex]=arr[currentIndex];
        }

      }

      ++currentIndex;
    }

    return movingIndex==-1;


  }
}

