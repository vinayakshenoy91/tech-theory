
//O(n^2) complexity, O(1) space complexity;

const longestPalindrome = (s) => {

    let startIndex = 0;
    let maxLength = 1;

    function expandAroundMiddle(left, right) {
        while (left >= 0 && right <= s.length && s[left] === s[right]) {
            const curentPalSize = right - left + 1;
            if (curentPalSize > maxLength) {
                maxLength = curentPalSize;
                startIndex = left;
            }

            left -= 1;
            right += 1;
        }

    }

    for (let i = 0; i < s.length; i++) {
        expandAroundMiddle(i - 1, i + 1);
        expandAroundMiddle(i, i + 1);
    }

    return s.slice(startIndex, startIndex + maxLength);

}