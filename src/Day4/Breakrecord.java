package Day4;

import java.util.Scanner;

public class Breakrecord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        find(n,arr);
    }

    public static void find(int n,int []arr) {
        // TODO: Implement logic here
        int maxe = arr[0],mine = arr[0];
        int max = 0;
        int min = 0;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] > maxe)
            {
                maxe = arr[i];
                max++;
            }
            else if(arr[i] < mine){
                mine = arr[i];
                min++;
            }
        }
        System.out.println(max + " " + min);
    }
}