package Day10;

import java.util.*;

public class Url {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        int index = str.lastIndexOf('.');
        String ans = str.substring(index + 1 , n);
        if(ans.equals("com") ||ans.equals("org") ||ans.equals("net") ||ans.equals("in"))
            System.out.println("true");
        else System.out.println("false");
    }
}