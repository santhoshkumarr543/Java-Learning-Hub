package Day26;

import java.util.*;

public class Longestprogeresivesequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        find(n, arr);
    }

    public static void find(int n, int[] arr) {
        // TODO: Implement logic here
        //List<Integer> list = new ArrayList<>();
        int max = 1;
        int i = 0,j = 1;
        int l = 0,r = 0;
        while(j< n){
            if(arr[j-1] <= arr[j]) {
               if(max < (j-i+1)){
                   max = j-i+1;
                   l = i;
                   r = j;
               }
            }
            else i = j;
            j++;
        }
        for(int k = l;k<=r;k++){
            System.out.print(arr[k] + " ");
        }
        //System.out.println(list);
    }
}