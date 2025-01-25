package Day13;

import java.util.*;

public class Cistern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a N");
        int n = sc.nextInt();
        System.out.println("Enter a R");
        int r = sc.nextInt();
        find(n, r);
    }

    public static void find(int n, int r) {
        // TODO: Implement logic here
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        int x = r * sum;
        int ssum = 0;
        while (x > 0) {
            int rem = x % 10;
            ssum += rem;
            x /= 10;
        }
        System.out.println(ssum);
    }
}