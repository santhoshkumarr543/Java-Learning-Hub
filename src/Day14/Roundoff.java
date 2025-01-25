package Day14;

import java.util.*;

public class Roundoff {

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

    public static void find(int n, int[] arr) {
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] += 1;
                print(arr);
                return;
            }
            arr[i] = 0;
        }

        int[] res = new int[n + 1];
        res[0] = 1;
        print(res);
    }

    public static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x);
        }
    }

}