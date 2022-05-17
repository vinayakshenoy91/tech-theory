



public class MissingNumber {

}


Update the value of sum as sum = sum – array[i] + c and update c as c++.


Algorithm: 
Create a variable sum = 1 to which will store the missing number and a counter c = 2.
Traverse the array from start to end.
Update the value of sum as sum = sum – array[i] + c and update c as c++.
Print the missing number as a sum.

static int getMissingNo(int a[], int n) 
{
    int total = 1;
    for (int i = 2; i <= (n + 1); i++)
    {
        total += i;
        total -= a[i - 2];
    }
    return total;
}



Approach: 
XOR has certain properties 
Assume a1 ^ a2 ^ a3 ^ …^ an = a and a1 ^ a2 ^ a3 ^ …^ an-1 = b
Then a ^ b = an
Algorithm: 
Create two variables a = 0 and b = 0
Run a loop from 1 to n with i as counter.
For every index update a as a = a ^ i
Now traverse the array from start to end.
For every index update b as b = b ^ array[i]
Print the missing number as a ^ b.

static int getMissingNo(int a[], int n)
{
    int x1 = a[0];
    int x2 = 1;

    /* For xor of all the elements 
       in array */
    for (int i = 1; i < n; i++)
        x1 = x1 ^ a[i];

    /* For xor of all the elements 
       from 1 to n+1 */
    for (int i = 2; i <= n + 1; i++)
        x2 = x2 ^ i;

    return (x1 ^ x2);
}

