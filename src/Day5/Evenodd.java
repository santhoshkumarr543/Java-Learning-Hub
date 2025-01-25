package Day5;

import java.util.Scanner;

public class Evenodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        find(n,arr);
    }

    public static void find(int n, int[] arr) {
        int sum = 0;
        long product = 1;
        //boolean isOdd = false;

        for (int x : arr) {
            sum += x;
            product *= x;
        }

        if ((sum % 2) == 0) {
            System.out.println(sum);
        } else {
            System.out.println(product);
        }
    }

}