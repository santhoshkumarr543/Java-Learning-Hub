package Day24;

import java.util.*;

public class Findthedifferenceofanarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        find(n, arr, arr1);
    }

    public static void find(int n, int[] arr, int[] arr1) {
        // TODO: Implement logic here
        Set<Integer> st = new HashSet<>();
        Set<Integer> st1 = new HashSet<>();
        List<Integer> ls = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<>();
        List<List<Integer>> ls3 = new ArrayList<>();
        for(int x : arr) st.add(x);

        for(int x : arr1) st1.add(x);

        for(int x : arr)
        {
            if(!st1.contains(x)) ls.add(x);
        }
        for(int x : arr1)
        {
            if(!st.contains(x)) ls1.add(x);
        }
        ls3.add(ls);
        ls3.add(ls1);
        System.out.println(ls3);
    }
}