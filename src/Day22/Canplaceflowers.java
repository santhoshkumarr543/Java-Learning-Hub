package Day22;

import java.util.*;

public class Canplaceflowers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a x value : ");
        int x = sc.nextInt();
        System.out.println(find(n,arr,x));
    }

    public static boolean find(int n,int[] arr,int x) {
        // TODO: Implement logic here
        if(n == 1){
            if(arr[0] == 0) return true;
            return false;
        }

        if(arr[0] == 0 && arr[1] == 0) {
            arr[0] = 1;
            x--;
        }
        if(arr[n - 1] == 0 && arr[n-2] == 0) {
            arr[n - 1] = 1;
            x--;
        }

        for(int i = 2;i<n;i++){
            if(arr[i-1] == 0 && arr[i] == 0 && arr[i+1] == 0){
                arr[i] = 1;
                x--;
            }
        }
        return x <= 0;

    }
}