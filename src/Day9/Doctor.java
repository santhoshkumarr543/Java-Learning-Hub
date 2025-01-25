package Day9;

import java.util.*;


public class Doctor {

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
        int length = arr.length;
        if(length < 20) {
            for (int i = 0; i < n; i++) {
                if (arr[i]  > 0 && arr[i] < 120)
                {
                    add(arr[i]);
                }

        }
    }
        else {
            System.out.println("Enter 20 elements only;");
        }
    }
    public static void add(int x)
    {
        int fees = 0;
        if(x < 17) fees += 200;
        else if(x >= 17 && x < 40)  fees += 400;
        else fees += 300;

        System.out.println(fees);
    }
}