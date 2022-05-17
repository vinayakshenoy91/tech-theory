package DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoinChange {

  public static void main(String[] args) {

    System.out.println(getCoinChange(new int[]{1,3,4}, 10));

  }

  //Return min count of coins else return -1
  public static int getCoinChange(int[] denoms, int n) {


    int[] numOfCoins = new int[n+1];

    Arrays.fill(numOfCoins,Integer.MAX_VALUE);

    int toCompare=0;
    numOfCoins[0]=0;
    for(int denom:denoms){
      for(int amount=0;amount<numOfCoins.length;amount++){

        if(denom<=amount){
          if(numOfCoins[amount-denom]==Integer.MAX_VALUE){
            toCompare= numOfCoins[amount-denom];
          }else{
            toCompare = numOfCoins[amount-denom]+1;
          }
          numOfCoins[amount]=Math.min(numOfCoins[amount],toCompare);

        }

      }
    }
    return numOfCoins[n]!=Integer.MAX_VALUE?numOfCoins[n]:-1;


  };
}
