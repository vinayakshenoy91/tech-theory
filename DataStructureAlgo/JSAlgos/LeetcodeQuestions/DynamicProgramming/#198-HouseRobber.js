
// Optimised using two variables
function rob(nums) {

    if (nums.length === 0) {
        return 0;
    } else if (nums.length === 1) {
        return nums[0];
    }

    for (let i = 1; i < nums.length; i++) {

        if (i == 1) {
            nums[1] = Math.max(nums[0], nums[1]);
        } else {
            if (nums[i - 1] > nums[i] + nums[i - 2]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i] = nums[i] + nums[i - 2]
            }
        }
    }
    return nums[nums.length - 1];
}


console.log(rob([2, 7, 9, 3, 1]));