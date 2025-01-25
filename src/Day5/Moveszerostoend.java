package Day5;

import java.util.Scanner;

public class Moveszerostoend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        find(n, arr);
    }

    public static void find(int n, int arr[]) {
        int first = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(first, i, arr);
                first++;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
