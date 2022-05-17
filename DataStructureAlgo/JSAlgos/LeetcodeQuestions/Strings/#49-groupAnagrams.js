/*Complexity Analysis

Time Complexity: O(NK \log K)O(NKlogK), where NN is the length of strs, and KK is the maximum length 
of a string in strs.The outer loop has complexity O(N)O(N) as we iterate through each string.Then, we sort each
string in O(K \log K)O(KlogK) time.

Space Complexity: O(NK)O(NK), the total information content stored in ans.*/

//Time Complexity: O(NK) Space: O(NK) |It's because we have N string - each having K number of char at most.
const groupAnagrams = (arr) => {

    const anaMap = {};

    for (let item of arr) {
        const sortedString = item.split("").sort().join("");
        if (anaMap[sortedString]) {
            anaMap[sortedString].push(item);
        } else {
            anaMap[sortedString] = [item];
        }
    }

    return Object.values(anaMap);

}

console.log(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]));



