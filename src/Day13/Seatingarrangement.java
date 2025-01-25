package Day13;

import java.util.*;

public class Seatingarrangement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        find(n);
    }

    public static void find(int n) {
        // TODO: Implement logic here
        long x = 1;
        for (int i = n - 1; i >= 1; i--) {
            x *= i;
        }
        System.out.println(x * 2);
    }
}