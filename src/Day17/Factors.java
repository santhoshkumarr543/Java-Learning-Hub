package Day17;

import java.util.*;

public class Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (N):");
        int n = sc.nextInt();
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();

        find(n, k);
    }

    public static void find(int n, int k) {
        int[] factors = new int[n];
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors[count++] = i;
                if (i != n / i) {
                    factors[count++] = n / i;
                }
            }
        }

        Arrays.sort(factors, 0, count);

        if (k <= count) {
            System.out.println(factors[count - k]);
        } else {
            System.out.println(1);
        }
    }
}
