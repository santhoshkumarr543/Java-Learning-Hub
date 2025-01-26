package Day25;

import java.util.*;

public class Productofarrayexceptself {

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
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int mul = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    mul *= arr[j];
                }
            }
            ans[i] = mul;
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
