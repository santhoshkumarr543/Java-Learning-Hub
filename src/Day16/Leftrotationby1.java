package Day16;

import java.util.*;

public class Leftrotationby1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        find(n,arr);
    }

    public static void find(int n,int[] arr) {
        // TODO: Implement logic here
        int res[] = new int[n];
        res[0] = arr[n - 1];
        int j = 1;
        for(int i = 0;i < n - 1;i++)
        {
            res[j] = arr[i];
            j++;
        }
        for(int x : res)
        {
            System.out.print(x + " ");
        }
    }
}