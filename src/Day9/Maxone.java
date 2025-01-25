package Day9;

import java.util.*;

public class Maxone {

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
        int max = 0;
        int count = 0;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] == 1)
            {
                count++;
                max = Math.max(max , count);
            }
            else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}