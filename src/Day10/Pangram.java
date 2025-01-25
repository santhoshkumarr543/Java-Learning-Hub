package Day10;

import java.util.*;

public class Pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        int[] freq = new int[26];
        boolean flag = true;
        String ans = str.toLowerCase();
        for(int i = 0;i < n;i++)
        {
            freq[ans.charAt(i) - 'a']++;
        }
        for(int i = 0;i < 26;i++)
        {
            if(freq[i] == 0)
            {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("it's a pangram");
        else System.out.println("Not a pangram");
    }
}