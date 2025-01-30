package Day26;

import java.util.*;

public class Superascii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of String");
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0;i < n;i++)
        {
            str[i] = sc.next();
        }
        find(str, n);
    }

    public static void find(String[] str, int n) {
        // TODO: Implement logic here
        for(int i = 0;i < n;i++)
        {
            boolean flag = false;
            Map<Character , Integer> mp = new HashMap<>();
            for(char ch : str[i].toCharArray())
            {
                mp.put(ch , mp.getOrDefault(ch , 0) + 1);
            }
            for(char ch : str[i].toCharArray())
            {
                int value = (int)ch - 'a' + 1;

                if(value > n) {
                    flag = false;
                    break;
                }

                if(mp.get(ch) == value) flag = true;
                else
                {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("yes");
            else System.out.println("no");
        }
    }
}