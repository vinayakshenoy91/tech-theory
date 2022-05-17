// Longest substring wo repeating chars

//O(N)

//sliting window will represent the current substring of non-repeating chars that we are on.
//Current index and value in for loop will always be end of the sliding window.As end of window increases, 
//We conditionally increase start of window.

//O(n) and space O(min(m,n))
const lengthOfLongestSubstring = (s) => {

    let startPointer = 0;
    let maxLength = 0;
    let charMap = {};
    let endPointer = 0;

    while (endPointer < s.length) {
        let currentCharacter = s[endPointer];

        if (charMap[currentCharacter] !== undefined) {
            startPointer = charMap[currentCharacter] >= startPointer ? charMap[currentCharacter] + 1 : startPointer;
        }
        charMap[currentCharacter] = endPointer;

        ++endPointer;

        if ((endPointer - startPointer) > maxLength) {
            maxLength = endPointer - startPointer;
        }

    }

    return maxLength
};



console.log(lengthOfLongestSubstring("abcabcbb"));

