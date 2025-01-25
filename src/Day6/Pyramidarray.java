package Day6;

import java.util.*;

public class Pyramidarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        find(n, arr);
    }

    public static void find(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(arr[j] + arr[j + 1] + " ");
                arr[j] = arr[j] + arr[j + 1];
            }
            System.out.println();
        }
    }
}
