

//O(N)  and space is O(1) as i tiwll have 26 kay value pairs

const isAnagram = (s, t) => {
    if (s.length != t.length) {
        return false;
    }

    const charMap = {};
    for (let x of s) {
        charMap[x] = charMap[x] + 1 || 1
    }

    for (let j of t) {
        if (!charMap[j]) {
            return false;
        }
        charMap[j] -= 1;
    }

    return true
}

console.log(isAnagram("hello", "holel"));



