package Day6;

import java.util.Scanner;

public class Matrix90 {

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

    public static void find(int n,int [][]arr) {
        // TODO: Implement logic here
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            swap(arr[i][j],arr[j][i]);
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        }
        public static void swap ( int a, int b)
        {
            int temp = a;
         a = b;
         b = temp;
    }
}