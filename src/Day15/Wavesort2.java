package Day15;

import java.util.*;

public class Wavesort2 {

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
        int res[] = new int[n];
        int j = 0, k = 0;
        for (int i = n - 1; i >= (n / 2); i--) {
            res[j] = arr[i];
            res[j + 1] = arr[k];
            k++;
            j += 2;
        }
        for (int x : res) {
            System.out.print(x);
        }
    }
}