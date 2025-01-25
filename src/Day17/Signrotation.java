package Day17;

import java.util.Scanner;

public class Signrotation {

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
        int[] pos = new int[n];
        int[] neg = new int[n];
        int poscount = 0, negcount = 0;

        for (int x : arr) {
            if (x < 0) {
                neg[negcount++] = x;
            } else {
                pos[poscount++] = x;
            }
        }

        int i = 0, posIndex = 0, negIndex = 0;

        while (posIndex < poscount && negIndex < negcount) {
            arr[i++] = pos[posIndex++];
            arr[i++] = neg[negIndex++];
        }

        while (posIndex < poscount) {
            arr[i++] = pos[posIndex++];
        }

        while (negIndex < negcount) {
            arr[i++] = neg[negIndex++];
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
