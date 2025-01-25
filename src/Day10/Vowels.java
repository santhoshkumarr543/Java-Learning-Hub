package Day10;

import java.util.*;

public class Vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str,n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        String ans = str.toLowerCase();
        int count = 0;
        for(int i = 0;i < n;i++)
        {
            if(ans.charAt(i) == 'a' || ans.charAt(i) == 'e' || ans.charAt(i) == 'i' || ans.charAt(i) == 'o'
                    || ans.charAt(i) == 'u' )
            {
                count++;
            }
        }
        System.out.println(count);
    }
}