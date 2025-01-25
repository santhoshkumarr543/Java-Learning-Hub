package Day16;

import java.util.*;

public class Arrayequals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0;i < n1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        find(n , n1, arr, arr1);
    }

    public static void find(int n,int n1,int[] arr , int[] arr1) {
        // TODO: Implement logic here
        int j = 0;
        for(int i = 0;i < n;i++)
        {
            if(j < n1) {
                if (arr[i] == arr1[j]) {
                    j++;
                }
            }
        }
        if(j == n1) System.out.println("yes");
        else System.out.println("no");
    }
}