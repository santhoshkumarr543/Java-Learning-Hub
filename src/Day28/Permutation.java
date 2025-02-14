package Day28;

import java.util.*;

public class Permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<String> ls = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        find(0 , n, arr,str,ls);
        System.out.println(ls);
    }

    public static void find(int idx ,int n, int[] arr,StringBuilder str,List<String> ls) {
        // TODO: Implement logic here
        if(idx == n)
        {
            ls.add(str.toString());
            return;
        }
        for(int i = 0;i < n;i++)
        {
            //if(i == idx) continue;
            str.append(arr[idx]);
            find(idx + 1,n,arr,str,ls);
            str.deleteCharAt(str.length() - 1);
        }
    }
}