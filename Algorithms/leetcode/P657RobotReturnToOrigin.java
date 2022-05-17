package Algos;


//"LLD"-> false, "RLUURDDDLU"-> true
public class P657RobotReturnToOrigin {

  public static void main(String[] args) {

    System.out.println(judgeCircle("LLD"));
  }

  public static boolean judgeCircle(String moves) {

    int countOfL = 0;
    int countOfR = 0;
    int countOfD = 0;
    int countOfU = 0;

    for (String i : moves.split("")) {

      switch (i) {
        case "L":
          countOfL += 1;
          break;
        case "R":
          countOfR += 1;
          break;
        case "D":
          countOfD += 1;
          break;
        case "U":
          countOfU += 1;
          break;
      }
    }

    return countOfL == countOfR && countOfD == countOfU;
  }
}


/*
moves.charAt(i);
class Solution {
    public boolean judgeCircle(final String moves) {
        final int[] result = new int[2];
        for (final char ch: moves.toCharArray()) {
            switch (ch) {
                case 'L':
                    result[0]--;
                    break;
                case 'R':
                    result[0]++;
                    break;
                case 'U':
                    result[1]++;
                    break;
                case 'D':
                    result[1]--;
                    break;
            }
        }
        return result[0] == 0 && result[1] == 0;
    }
}
 */