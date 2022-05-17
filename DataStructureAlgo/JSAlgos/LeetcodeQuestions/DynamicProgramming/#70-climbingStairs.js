/*

Steps and ways:

Fibonacci sequence from 4 onwards
Steps wa
1,1 [1]
2,2 [1,2] [2]
3,3
4,5
*/



const mapItem = { 1: 1, 2: 2 };

function climbStairs(n) {

    if (mapItem[n]) {
        return mapItem[n];
    }

    mapItem[n] = climbStairs(n - 1) + climbStairs(n - 2);
    return mapItem[n]
}

console.log(climbStairs(1));

/*
public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
*/

/* O(1) space complexity
public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}*/

//DP

/* public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}*/

/* O(logn) solution

https://leetcode.com/problems/climbing-stairs/solution/  ---> Study this approach

*/