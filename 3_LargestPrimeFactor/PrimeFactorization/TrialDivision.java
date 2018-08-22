import java.io.*;
import java.util.*;
import java.math.*;

public class TrialDivision {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        List<Integer> pf = new ArrayList<>();
        int f = 2;
        
        while(n > 1) {
            if(n % f == 0) {
                pf.add(f);
                n /= f;
            }
            else {
                f++;
            }
        }
        printList(pf);
    }

    public static void printList(List<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}