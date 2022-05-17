//const data = "A man, a plan, a canal: Panama" : true
//const data = "race a car"; : false


//O(N)  and space is O(1)
const isPalindrome = (s) => {

    const x = s.toLowerCase().replace(/[\W_]/g, "");
    let leftPointer = 0;
    let rightPointer = x.length - 1;

    while (leftPointer < rightPointer) {
        if (x[leftPointer] !== x[rightPointer]) {
            return false;
        }
        ++leftPointer;
        --rightPointer;
    }
    return true;


}

console.log(isPalindrome());



