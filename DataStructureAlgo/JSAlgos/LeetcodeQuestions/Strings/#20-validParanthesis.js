
//Time Complexity: O(N) Space: O(N) 
const validParanthesis = (str) => {

    const oppositeBracket = ['(', ')', '[', ']', '{', '}'];
    const stack1 = [];

    if (str.length % 2 != 0) {
        return false;
    }

    for (let bracket of str.split("")) {
        if (oppositeBracket.indexOf(bracket) % 2 == 0) {
            stack1.push(bracket);
        } else {
            if (stack1.length === 0) {
                return false;
            }
            const indexOfOppositeBracket = oppositeBracket.indexOf(bracket);
            const correctBracket = stack1.pop();

            if (oppositeBracket.indexOf(correctBracket) !== indexOfOppositeBracket - 1) {
                return false;
            }
        }
    }

    return stack1.length === 0;

}

console.log(validParanthesis("(("));


/* Solution 2

let stack =[];

let pairsHashMap={"(":")","{":"}","[":"]""};

for(let i=0;i<s.length;i++){
    let char=s[i];
    if(pairsHashMap[char]){
        stack.push(char);
    }else if(pairsHashMap[stack.pop()]!==char){
        return false;
    }
}

return stack1.length === 0;

*/



