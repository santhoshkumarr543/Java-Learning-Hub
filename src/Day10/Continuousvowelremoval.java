package Day10;

import java.util.*;

public class Continuousvowelremoval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        Map<Character , Character> mp = new HashMap<>();
        mp.put('a','a');
        mp.put('e','e');
        mp.put('i','i');
        mp.put('o','o');
        mp.put('u','u');
        StringBuilder sb = new StringBuilder();
        //if(mp.containsKey(str.charAt(i)) )
        //int i = 0;
        sb.append(str.charAt(0));
        for(int i = 0;i < n - 1;i++)
        {
            char ch = str.charAt(i);
            char ch1 = str.charAt(i + 1);
            if(!mp.containsKey(ch) || !mp.containsKey(ch1)) sb.append(ch1);
        }
        //if(!mp.containsKey(str.charAt(n -1))) sb.append(str.charAt(n -1));
        System.out.println(sb.toString());
    }
}