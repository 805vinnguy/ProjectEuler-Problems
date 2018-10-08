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
            ArrayList<Long> fiblist = genfib(n);
            System.out.println(sum_even(fiblist));
        }
    }

    /* 
        Generates the fibonacci sequence whose values are
        less than or equal to parameter n.
     */
    public static ArrayList<Long> genfib(long n) {
        ArrayList<Long> fiblist = new ArrayList<>();
        fiblist.add(new Long(1));/* i=0 */
        fiblist.add(new Long(2));/* i=1 */
        int i = 1;
        while(fiblist.get(i) <= n) {
            long next = fiblist.get(i-1) + fiblist.get(i);
            fiblist.add(next);
            i++;
        }
        return fiblist;
    }

    /* 
        Accumulates the even values in the parameter list
        and returns their sum.
     */
    public static long sum_even(ArrayList<Long> list) {
        long sum = 0;
        for(int i = 0; i < list.size()-1; i++) {
            if(list.get(i) % 2 == 0) {
                sum += list.get(i);
            }
        }
        return sum;
    }
}