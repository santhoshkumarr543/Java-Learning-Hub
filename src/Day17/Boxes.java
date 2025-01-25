package Day17;

import java.util.*;

public class Boxes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of boxes");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        find(n, arr);
    }

    public static void find(int n, int[] arr) {
        // TODO: Implement logic here
        int sum = n * (n + 1)/2;
        int i = 1;
       while(i < n - 1)
       {
           sum += arr[i] * (arr[i] + 1)/2;
           i++;
       }
        System.out.println(sum);
    }
}