package Day25;

import java.util.*;

public class Equalrowandcolumnpair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0;j < n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        find(n, arr);
    }

    public static void find(int n, int[][] arr) {
        // TODO: Implement logic here
        Map<String , Integer> mp = new HashMap<>();
        int count = 0;
        for(int i = 0;i < n;i++)
        {
            StringBuilder str = new StringBuilder();
            for(int j = 0;j < n;j++)
            {
                str.append(arr[i][j]);
            }
            String rowstr = str.toString();
            mp.put(rowstr , mp.getOrDefault(rowstr , 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            StringBuilder str1 = new StringBuilder();
            for(int j = 0;j < n;j++) {
                str1.append(arr[j][i]);
            }
            String colstr = str1.toString();
            if(mp.containsKey(colstr))
            {
                count += mp.get(colstr);
            }
        }
        System.out.println(count);
    }
}