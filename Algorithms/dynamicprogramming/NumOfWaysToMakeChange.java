package DynamicProgramming;

import java.util.Arrays;

public class NumOfWaysToMakeChange {

  public static void main(String[] args) {

    System.out.println(getCoinChangeWays(new int[]{1,3,4}, 4));

  }

  //Return min count of coins else return -1
  public static int getCoinChangeWays(int[] denoms, int n) {

    // Write your code here.
    int[] numsOfCoins = new int[n+1];
    numsOfCoins[0]=1;

    for(int denom:denoms){
      for(int amount=1;amount<numsOfCoins.length;amount++){

        if(denom<=amount){
            numsOfCoins[amount] += numsOfCoins[amount-denom];

        }

      }
    }

    return n==0?1:numsOfCoins[n];


  };
}

/* v2

	int[] numsOfCoins = new int[n+1];
		Arrays.fill(numsOfCoins,0);
		int ways=0;

		for(int denom:denoms){
			for(int amount=0;amount<numsOfCoins.length;amount++){

				if(denom<=amount){
              if(denom==amount){
                 ++numsOfCoins[amount];
							}else{
                numsOfCoins[amount] += numsOfCoins[amount-denom];
							}

				}

			}
		}

    return n==0?1:numsOfCoins[n];
 */
