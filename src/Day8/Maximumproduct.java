package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class Maximumproduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        find(n,arr);
    }

    public static void find(int n,int[] arr) {
        // TODO: Implement logic here

        Arrays.sort(arr);
        int fans = arr[0] * arr[1] * arr[n - 1];
        int sans = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int max = Math.max(fans,sans);
        System.out.println(max);
    }
}