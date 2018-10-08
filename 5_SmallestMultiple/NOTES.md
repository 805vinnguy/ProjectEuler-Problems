# NOTES

+ 6 is divisible by each of S = {1, 2, 3}, giving quotient {6, 3, 2}.
    + start with b=1.
    + for each of S:
        + check if b % s_i:
            + if not: b *= s_i
+ 2520 is divisible by each of S = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, giving quotient
  {2520, 1260, 840, 630, 504, 420, 360, 315, 280, 252}.
    + start with b=1.
    + rewrite S = {1, 2, 3, 2^2, 5, 6, 7, 2^3, 3^2, 10}
    + for each of S:
        + check if b % s_i:
            + if not: b *= s_i (ignoring powers)