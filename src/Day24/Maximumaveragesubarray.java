package Day24;

import java.util.*;

public class Maximumaveragesubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter a window size : ");
        double k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        find(n, arr,k);
    }

    public static void find(int n, int[] arr,double k) {
        // TODO: Implement logic here
        int ans = 0;
        for(int i = 0;i <= n - k;i++)
        {
            int sum = 0;
            for(int j = i;j < i + k;j++)
            {
                sum += arr[j];
                ans = Math.max(ans , sum);
            }
        }
        System.out.println(ans / k);
    }
}