package Day10;

import java.util.*;

public class Pgm14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        String ans = str.toLowerCase();
        boolean flag = true;
        for(int i = 0;i < n;i++)
        {
            if(ans.charAt(i) >= 97 && ans.charAt(i) <= 122)
            {
                flag = false;
            }
        }
        if(flag) System.out.println(str);
        else System.out.println("0");
    }
}