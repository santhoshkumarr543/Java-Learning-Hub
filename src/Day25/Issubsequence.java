package Day25;

import java.util.*;

public class Issubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        System.out.println("enter a target string");
        String target = sc.next();
        System.out.println(find(str, n,target));
    }

    public static boolean find(String str, int n,String target) {
        // TODO: Implement logic here
        for(int i = 0;i < target.length();i++)
        {
            boolean flag = false;
            for(int j = 0;j < n;j++)
            {
                if(target.charAt(i) == str.charAt(j)) flag = true;
            }
            if(!flag) return false;
        }
        return true;
    }
}