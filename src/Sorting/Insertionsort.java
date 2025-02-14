package Sorting;

import java.util.*;

public class Insertionsort {

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
        for(int i = 1;i < n;i++)
        {
            int k = arr[i],j = i - 1;
            while(j >= 0 && arr[j] > k)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
        }

        System.out.println("After sorting : ");
        for(int x : arr) System.out.print(x + " ");
    }
}