package Day5;

import java.util.Scanner;

public class Diagonal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        find(n, arr);
    }

    public static void find(int n, int[][] arr) {
        int ld = 0, rd = 0;

        for (int i = 0; i < n; i++) {
            ld += arr[i][i];
            rd += arr[i][n - 1 - i];
        }


        int ans = Math.abs(ld - rd);
        System.out.println(ans);
    }
}
