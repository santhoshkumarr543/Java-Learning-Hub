package Day25;

import java.util.*;

public class Longestsubarrayafter1element {

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
        int i = 0, ans = 0, zerocnt = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] == 0) zerocnt++;

            while (zerocnt > 1) {
                if (arr[i] == 0) zerocnt--;
                i++;
            }

            ans = Math.max(ans, j - i);
        }

        System.out.println(ans);
    }
}