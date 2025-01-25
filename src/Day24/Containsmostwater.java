package Day24;

import java.util.*;

public class Containsmostwater {

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
        // TODO: Implement logic here
        int i = 0,j = n - 1;
        int ans = 0;
        while(i < j)
        {
            ans = Math.max(ans ,Math.min(arr[i] , arr[j]) * (j - i));
                    if(arr[i] < arr[j]) i++;
                    else j--;
        }
        System.out.println(ans);
    }
}