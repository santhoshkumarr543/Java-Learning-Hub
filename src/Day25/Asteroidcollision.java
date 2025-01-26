package Day25;

import java.util.*;

public class Asteroidcollision {

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
        Stack<Integer> st = new Stack<>();
        for(int x : arr)
        {
            boolean destroy = false;

            while(!st.empty() && x < 0 && st.peek() > 0)
            {
                if(Math.abs(x) > st.peek()) st.pop();
                else if(Math.abs(x) == st.peek()) st.pop();
                destroy = true;
                break;
            }
            if(!destroy) st.add(x);
        }
        System.out.println(st);
    }
}