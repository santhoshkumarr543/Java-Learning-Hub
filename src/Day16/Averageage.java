package Day16;

import java.util.*;

public class Averageage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row");
        int r = sc.nextInt();
        System.out.println("Enter a col");
        int c = sc.nextInt();
        System.out.println("Enter a Average age");
        int age = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0;i < r;i++)
        {
            for(int j = 0;j < c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        find(r,c,arr,age);
    }

    public static void find(int r,int c,int[][] arr,int age) {
        // TODO: Implement logic here
        int count = 0;
        for(int i = 0;i < r;i++)
        {
            int sum = 0;
            for(int j = 0;j < c;j++)
            {
                sum += arr[i][j];
            }

            if((sum / c) > age) count++;
        }
        System.out.println(count);
    }
}