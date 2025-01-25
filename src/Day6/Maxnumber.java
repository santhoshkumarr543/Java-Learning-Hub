package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Maxnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        find(n,arr);
    }

    public static void find(int n, int[] arr) {
        // TODO: Implement logic here
        String[] str = new String[n];
        String ans = "";
        for(int i = 0;i < n;i++)
        {
            str[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(str , (a , b) -> (b + a).compareTo(a + b));

        for(String x : str)
        {
            ans += x;
        }
        System.out.println(ans);
    }
}