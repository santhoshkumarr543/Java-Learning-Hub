package Day14;

import java.util.*;

public class Buyandsell {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        find(n, arr);
    }

    public static void find(int n, int[] arr) {
        if (n == 0) {
            System.out.println("0");
            return;
        }

        int min = arr[0];
        int max = 0;

        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i] - min);
        }

        System.out.println(max);
    }

}