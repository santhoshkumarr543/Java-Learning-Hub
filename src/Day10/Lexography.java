package Day10;

import java.util.*;

public class Lexography {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        System.out.println("Enter a String");
        String str1 = sc.next();
        int n = str.length();
        find(str, n , str1);
    }

    public static void find(String str, int n,String str1) {
        // TODO: Implement logic here
        int ans = 0;
        //int diff;
        for(int i = 0;i < n;i++)
        {
            if(str.charAt(i) != str1.charAt(i))
            {
                ans = str.charAt(i) - str1.charAt(i);
                break;
            }
        }
        System.out.println(ans);
    }
}