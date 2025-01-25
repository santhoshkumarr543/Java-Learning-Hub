package Day9;

import java.util.*;

public class Minandmax {

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
        // TODO: Implement logic here
        Arrays.sort(arr);

        int min = 0, max = 0;

        for (int i = 0; i <= n - 2; i++) {
            min += arr[i];
            max += arr[i + 1];
        }
        System.out.println("MIN " + min + "MAX " + max);
    }
}