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
            long sum = 0;
            int a = 3;
            int d1 = 3;
            long n1 = N / 3;
            int b = 5;
            int d2 = 5;
            long n2 = N / 5;
            int c = 15;
            int d3 = 15;
            long n3 = N / 15;
            sum += (n1 * ((2*a) + (n1-1)*d1)) / 2;
            sum += (n2 * ((2*b) + (n2-1)*d2)) / 2;
            sum -= (n3 * ((2*c) + (n3-1)*d3)) / 2;
            if(N % 3 == 0 || N % 5 == 0) {
                sum -= N;
            }
            System.out.println(sum + "");
        }

        in.close();
    }
}
