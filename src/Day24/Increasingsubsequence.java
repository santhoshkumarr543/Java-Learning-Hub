package Day24;

import java.util.*;

public class Increasingsubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(find(n, arr));
    }

    public static boolean find(int n, int[] arr) {
        // TODO: Implement logic here
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] < first) first = arr[i];
            else if(arr[i] > first && arr[i] < second) second = arr[i];
            else if(arr[i] > first && arr[i] > second) return true;
        }
        return false;
    }
}