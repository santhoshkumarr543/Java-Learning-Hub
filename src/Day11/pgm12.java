package Day11;

import java.util.*;

public class pgm12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        //String str = sc.next();
        long n = sc.nextLong();

        find(n);
    }

    public static void find(long n) {
        // TODO: Implement logic here
        int count = 1;
        long ans = 0;
        while(n > 0)
        {
            long rem = n % 10;
            ans = ans + (count * rem);
            count++;
            n /= 10;
        }
        System.out.println(ans);
        if((ans % 11) == 0) System.out.println("ISBN number");
        else System.out.println("not an ISBN number");
    }
}