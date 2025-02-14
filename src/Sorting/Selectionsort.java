package Sorting;

import java.util.*;

public class Selectionsort {

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
        for(int i = 0;i < n - 1;i++)
        {
            int min = i;
            for(int j = i + 1;j < n;j++)
            {
                if(arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("After sorting : ");
        for(int x : arr) System.out.print(x + " ");
    }
}