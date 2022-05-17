/*

Time complexity : O(numRows^2)
Space complexity : O(numRows^2)
Although updating each value of triangle happens in constant time, it is performed O(numRows^2)times. 
To see why, consider how many overall loop iterations there are. The outer loop obviously runs numRowsnumRows times, 
but for each iteration of the outer loop, the inner loop runs rowNumrowNum times. Therefore, the overall number of triangle 
updates that occur is 1 + 2 + 3 + ... +numRows, which, according to Gauss' formula, is
 O(numRows^2)

*/

/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function (numRows) {

    let arr = [];

    for (let i = 0; i < numRows; i++) {

        if (i == 0) {
            arr.push([1]);
        }

        if (i == 1) {
            arr.push([1, 1]);
        }

        if (i >= 2) {

            let temparr = [1];

            for (let j = 0; j < i - 1; j++) {
                temparr.push(arr[i - 1][j] + arr[i - 1][j + 1]);
            }

            temparr.push(1);
            arr.push(temparr);
        }

    }
    return arr;
};