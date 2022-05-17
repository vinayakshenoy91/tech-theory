// TODO: REDO : https://leetcode.com/problems/jump-game/solution/
/* If possbile to reach i step and i step can reach j step , set j step DP value to true*/





//O(n^2)
//O(N)
function canJump(nums) {

    let dpPositions = new Array(nums.length).fill(false)

    dpPositions[0] = true;

    for (let j = 1; j < nums.length; j++) {
        for (let i = 0; i < j; i++) {
            if (dpPositions[i] && i + nums[i] >= j) {
                dpPositions[j] = true;
                break;
            }
        }

    }

    return dpPositions[nums.length - 1];
};

console.log(canJump([3, 2, 1, 0, 4]));

// Greedy apprahc starting from last
O(n), O(1)

    /* 
    public class Solution {
        public boolean canJump(int[] nums) {
            int lastPos = nums.length - 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (i + nums[i] >= lastPos) {
                    lastPos = i;
                }
            }
            return lastPos == 0;
        }
    }
    */


    * /