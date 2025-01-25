package Day6;

import java.util.Scanner;

public class Previouselementgreater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        find(n,arr);
    }

    public static void find(int n,int[] arr) {
        // TODO: Implement logic here
        int count = 0;
        //boolean br = true;
        for(int i = 0;i < n;i++)
        {
            boolean br = true;
            for(int j = 0;j < i;j++)
            {
                if(arr[j] > arr[i])
                {
                    br = false;
                    break;
                }
                if(br)
                count++;
            }
        }
        System.out.println(count);
    }
}