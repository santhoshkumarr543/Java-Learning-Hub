package Day16;

import java.util.*;

public class Birthdayparty {

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

    public static void find(int n,int[]arr) {
        // TODO: Implement logic here
        Arrays.sort(arr);

        if(n < 2) System.out.println("1");

        int count = 1;
        for(int i = 1;i < n;i++)
        {
            if(arr[i] != arr[i -1])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}