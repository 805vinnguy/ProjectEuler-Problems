import java.io.*;
import java.util.*;
import java.math.*;

public class TD2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        List<Integer> pf = new ArrayList<>();
        int f = 3;

        while(n % 2 == 0) {
            pf.add(2);
            n /= 2;
        }
        while(f * f <= n) {
            if(n % f == 0) {
                pf.add(f);
                n /= f;
            }
            else {
                f += 2;
            }
        }
        if(n > 2) {
            pf.add((int)n);
        }
        printList(pf);
    }

    public static void printList(List<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}