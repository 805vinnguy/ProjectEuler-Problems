# NOTES

1. Generate fibonacci sequence whose values do not exceed(are less than or equal to) N.
    + create a list of said values.
2. Sum up the even values in the above sequence.
    + loop through the list and sum up even terms.
        + check for even: n % 2.

## Possible Bugs

1. In order for the algorithm to check that a value is less than or equal to N,
   the list must already contain that value, hence when summing the evens, that
   value may be incorrectly included.