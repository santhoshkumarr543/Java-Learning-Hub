package Day26;

import java.util.*;

public class Logicpyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        find(n);
    }

    public static void find(int n) {
        // TODO: Implement logic here
        int first = 6,mid = 22,diff = 16;
        int k = 0;
        for(int i = 0;i < n;i++){
           for(int j = 0;j<n;j++){
               if(i + j >= n-1){
                   int temp = first;
                   StringBuilder str = new StringBuilder();
                   int t = 5;
                   while(t > 0){
                       str.insert(0,temp%10);
                       temp /= 10;
                       t--;
                   }
                   first += mid + (k++) * diff;
                   System.out.print(str+" ");
               }else System.out.print(" ");
           }
           System.out.println();
        }

    }
}