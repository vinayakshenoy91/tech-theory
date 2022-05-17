package DynamicProgramming;

import java.util.Arrays;

public class RobberProblem {

  public static void main(String[] args) {

    int[] arr={6,7,1,30,8,2,4};
    System.out.println(robHouse(arr));

  }

  //Bottom top approach

  public static int robHouse(int[] houses){

    int[] newHouses = new int[houses.length+2];


    for(int i=0;i<houses.length;i++){
      newHouses[i]=houses[i];
    }

    for(int j=houses.length-1;j>=0;j--){
      newHouses[j]=Math.max(newHouses[j]+newHouses[j+2],newHouses[j+1]);
    }



   return newHouses[0];

  }

}

/*

private int maxMoneyTopDown(int[] dp, int[] HouseNetWorth, int currentIndex) {
		if (currentIndex >= HouseNetWorth.length)
			return 0;

		if (dp[currentIndex] == 0) {
			int stealCurrent = HouseNetWorth[currentIndex] + maxMoneyTopDown(dp, HouseNetWorth, currentIndex + 2);
			int skipCurrent = maxMoneyTopDown(dp, HouseNetWorth, currentIndex + 1);
			dp[currentIndex] = Math.max(stealCurrent, skipCurrent);
		}
		return dp[currentIndex];
	}




 */