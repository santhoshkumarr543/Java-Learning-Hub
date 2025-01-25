package Day24;

import java.util.*;

public class Maxconsecutiveones111 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter a window sixe");
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        find(n, arr, k);
    }

    public static void find(int n, int[] arr, int k) {
        // TODO: Implement logic here
        int i = 0,ans = 0;
        for(int j = 0;j < n;j++)
        {
            if(arr[j] == 0) k--;

            while(k < 0)
            {
                if(arr[i] == 0)
                {
                    k++;
                }
                i++;
            }

            ans = Math.max(ans , (j - i) + 1);
        }
        System.out.println(ans);
    }
}