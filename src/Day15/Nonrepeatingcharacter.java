package Day15;

import java.util.*;

public class Nonrepeatingcharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        System.out.println(find(str, n));
    }

    public static char find(String str, int n) {
        // TODO: Implement logic here
        Map<Character , Integer> mp = new HashMap<>();
        for(char x : str.toCharArray())
        {
            mp.put(x , mp.getOrDefault(x , 0) + 1);
        }
        for (char x : str.toCharArray()) {
            if (mp.get(x) == 1) {
                return x;
            }
        }
        return '0';
    }
}