package Day15;

import java.util.*;

public class Rectangelarea {

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
        Arrays.sort(arr);
        int side1 = -1, side2 = -1;

        for (int i = n - 1; i >= 1; i--) {
            if (arr[i] == arr[i - 1]) {
                side1 = arr[i];
                break;
            }
        }

        for (int i = n - 1; i >= 1; i--) {
            if (arr[i] == arr[i - 1] && arr[i] != side1) {
                side2 = arr[i];
                break;
            }
        }

        if (side1 == -1 || side2 == -1) {
            System.out.println("-1");
        } else {
            System.out.println(side1 * side2);
        }
    }
}
