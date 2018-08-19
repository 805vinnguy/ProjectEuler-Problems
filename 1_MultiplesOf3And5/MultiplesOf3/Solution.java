import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){
            int N = in.nextInt();
            int a = 3;
            int d = 3;
            long n = N / 3;
            long sum = (n * ((2*a) + (n-1)*d)) / 2;
            System.out.println(sum + "");
        }

        in.close();
    }
}

/*
    3, 6, 9, 12, 15, 18, 21, ...
    summing an arithmetic series
    a = 3
    d = 3
    n = N / 3
    S = n/2 * (2a + (n-1)d)
*/
