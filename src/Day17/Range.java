package Day17;

import java.util.*;

public class Range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of ranges:");
        int r = sc.nextInt();
        int[][] mat = new int[r][2];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < 2; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        find(n, arr, mat, r);
    }

    public static void find(int n, int[] arr, int[][] mat, int r) {
        for (int i = 0; i < r; i++) {
            int count = 0;
            int start = mat[i][0];
            int end = mat[i][1];
            for (int j = 0; j < n; j++) {
                if (arr[j] >= start && arr[j] <= end) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
