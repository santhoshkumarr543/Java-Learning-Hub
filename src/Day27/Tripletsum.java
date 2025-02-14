package Day27;

import java.util.*;

public class Tripletsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a target : ");
        int t = sc.nextInt();
        System.out.println(find(n, arr, t));
    }

    public static boolean find(int n, int[] arr, int t) {
        // TODO: Implement logic here
        Arrays.sort(arr);
        for(int i = 0;i < n - 2;i++)
        {
            int start = i + 1;
            int end = n - 1;
            while(start < end)
            {
                int sum = (arr[i] + arr[start] + arr[end]);
                if(sum == t) return true;
                else if(sum > t) end--;
                else start++;
            }
        }
        return false;
    }
}