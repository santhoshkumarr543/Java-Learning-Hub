package Day25;

import java.util.*;

public class Star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }
    public static void find(String str, int n) {
        // TODO: Implement logic here
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < n;i++)
        {
            if(str.charAt(i) != '*') st.push(str.charAt(i));
            else st.pop();
        }
        System.out.println(st);
    }
}