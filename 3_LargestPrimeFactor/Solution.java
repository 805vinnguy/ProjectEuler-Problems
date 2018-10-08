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
            long n = in.nextLong();
            int f = 3;

            if(n == 0) {
                System.out.println("0");
                return;
            }
            if(n == 1) {
                System.out.println("1");
                return;
            }
            while(n > 0 && n % 2 == 0) {
                n /= 2;
            }
            if(n == 1) {
                System.out.println("2");
                return;
            }
            while(f * f <= n) {
                if(n % f == 0) {
                    n /= f;
                    f = 3;
                    continue;
                }
                else {
                    f += 2;
                }
            }
            if(n > 2) {
                System.out.println(n + "");
            }
            else {
                System.out.println(f + "");
            }
        }
    }
}