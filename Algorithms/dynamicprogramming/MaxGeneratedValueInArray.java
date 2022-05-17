package DynamicProgramming;

class MaxGeneratedValueInArray {

  public static void main(String[] args) {

    System.out.println(getMaximumGenerated(7));

  }

  public static int getMaximumGenerated(int n) {


    int[] nums = new int[n+1];

    if(n==0){
      return 0;
    }
    if(n==1){
      return 1;
    }

    nums[0]=0;
    nums[1]=1;

    int max=1;
    for (int i = 1; i <= n / 2; i++) {
      nums[i * 2] = nums[i];
      if (i * 2 + 1 <= n) {
        nums[i * 2 + 1] = nums[i] + nums[i + 1];
        max = Math.max(max, nums[i * 2 + 1]);
      }
    }
    return max;

  }
}
