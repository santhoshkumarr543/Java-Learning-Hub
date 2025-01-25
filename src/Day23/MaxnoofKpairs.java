package Day23;

import java.util.*;

public class MaxnoofKpairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target : ");
        int target = sc.nextInt();
        find(n, arr, target);
    }

    public static void find(int n, int[] arr,int target) {
        // TODO: Implement logic here
        Arrays.sort(arr);
        int i = 0,j = n - 1;
        int count = 0;
        while(i < j)
        {
            if(arr[i] + arr[j] == target) {
                i++;
                j--;
                count++;
            }
            else if(arr[i] + arr[j] < target) i++;
            else j--;
        }
        System.out.println(count);
    }
}