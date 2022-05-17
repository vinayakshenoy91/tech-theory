/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function (a, b) {

    let result = '';

    let remainder = 0;

    if (a.length > b.length) {
        let diff = a.length - b.length;
        b = Array(diff).fill(0).join("") + b;
    } else if (b.length > a.length) {
        let diff = b.length - a.length;
        a = Array(diff).fill(0).join("") + a;
    }

    for (let i = a.length - 1; i >= 0; i--) {

        let number = a[i] ^ b[i] ^ remainder;

        if ((a[i] == 1 && b[i] == 1) || (b[i] == 1 && remainder == 1) || (a[i] == 1 && remainder == 1)) {
            remainder = 1;
        } else {
            remainder = 0;
        }

        result = `${number}${result}`

    }

    if (remainder == 1) {
        result = 1 + result;
    }

    return result

};