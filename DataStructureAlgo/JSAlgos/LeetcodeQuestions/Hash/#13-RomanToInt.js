/*
Always aks if the input is valid
*/

//Imporved left to right
class Solution {

    static Map<String, Integer> values = new HashMap <> ();

    static {
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);
        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);
    }

    public int romanToInt(String s) {
        
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            if (i < s.length() - 1) {
                String doubleSymbol = s.substring(i, i + 2);
                // Check if this is the length-2 symbol case.
                if (values.containsKey(doubleSymbol)) {
                    sum += values.get(doubleSymbol);
                    i += 2;
                    continue;
                }
            }
            // Otherwise, it must be the length-1 symbol case.
            String singleSymbol = s.substring(i, i + 1);
            sum += values.get(singleSymbol);
            i += 1;
        }
        return sum;
    }
}

//*JS

/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function (s) {

    const romanToIntMap = {
        "I": 1,
        "V": 5,
        "X": 10,
        "L": 50,
        "C": 100,
        "D": 500,
        "M": 1000
    };

    let romanArr = s.split("");

    let numberToSubtract = 0;

    let intOutput = 0;

    for (let i = 0; i < romanArr.length; i++) {

        intOutput += romanToIntMap[romanArr[i]];

        if ((romanArr[i] == "V" || romanArr[i] == "X") && (i - 1) >= 0) {
            if (romanArr[i - 1] == "I") {
                numberToSubtract += 2 * romanToIntMap[romanArr[i - 1]]
            }
        } else if ((romanArr[i] == "L" || romanArr[i] == "C") && (i - 1) >= 0) {
            if (romanArr[i - 1] == "X") {
                numberToSubtract += 2 * romanToIntMap[romanArr[i - 1]]
            }
        } else if ((romanArr[i] == "D" || romanArr[i] == "M") && (i - 1) >= 0) {
            if (romanArr[i - 1] == "C") {
                numberToSubtract += 2 * romanToIntMap[romanArr[i - 1]]
            }
        }

    }

    return intOutput - numberToSubtract;

};

