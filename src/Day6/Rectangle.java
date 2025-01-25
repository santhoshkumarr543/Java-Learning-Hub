package Day6;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] rec = new int[n];
        int[] rec1 = new int[n];

        for(int i = 0;i < n;i++)
        {
            rec[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++)
        {
            rec1[i] = sc.nextInt();
        }
        find(n,rec,rec1);
    }

    public static void find(int n,int []rec , int []rec1) {
        // TODO: Implement logic here
        if(rec[n- 2] == rec[n-1] && rec1[n-2] == rec1[n-1]) {
            if (rec[n - 1] > rec1[n - 1] && rec[n - 2] > rec1[n - 2]) System.out.println("true");
            else System.out.println("false");
        }
    }
}