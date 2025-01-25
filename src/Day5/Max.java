package Day5;

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int []arr1 = new int[n];
        for(int i =0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i =0;i < n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        find(n,arr,arr1);
    }

    public static void find(int n,int []arr,int []arr1) {
        // TODO: Implement logic here
        int max = 0,ans = 0;
        for(int i = 0;i < n;i++)
        {
            max += arr[i];
            max -= arr1[i];
            ans = Math.max(ans,max);
        }
        System.out.println(ans);
    }
}