package Day14;

import java.util.*;

public class Occurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter a target");
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        find(n, arr,t);
    }

    public static void find(int n,int[] arr,int t) {
        // TODO: Implement logic here
        int count = 0;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] == t) count++;
        }
        System.out.println(n - count);
    }
}