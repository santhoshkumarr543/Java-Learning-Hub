package Day6;

import java.util.Scanner;

public class Timerclock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        find(n,arr);
    }

    public static void find(int n,int[][] arr) {
        // TODO: Implement logic here
        int max = 0;
        for(int i = 0;i < n - 2;i++)
        {
            for(int j = 0;j < n - 2;j++)
            {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];
                max = Math.max(max,sum);
            }
        }
        System.out.println(max);
    }
}