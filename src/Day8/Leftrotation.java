package Day8;

import java.util.Scanner;

public class Leftrotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        System.out.println("Enter the rotations");
        int r = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        find(n, arr, r);
        System.out.println("Array after rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void find(int n, int[] arr, int r) {
        r = r % n;
        reverse(arr, 0, r - 1);
        reverse(arr, r, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
