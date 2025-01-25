package Day5;

import java.util.Scanner;

public class Firstandlastoccurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no to find");
        int find  =sc.nextInt();
        find(n,arr,find);
    }

    public static void find(int n,int []arr,int find) {
        // TODO: Implement logic here
        int findex = 0;
        int sindex = 0;
        int count = 0;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] == find)
            {
                if(count <= 0) {
                    findex = i;
                    count++;
                }
                if(findex >= 0)
                {
                    sindex = i;
                }
            }
        }
        System.out.println(findex + " " + sindex);
    }
}