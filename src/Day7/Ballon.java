package Day7;

import java.util.HashMap;
import java.util.Scanner;

public class Ballon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        char[] ch = new char[n];
        for(int i = 0;i < n;i++)
        {
            ch[i] = sc.next().charAt(0);
        }
        find(n,ch);
    }

    public static void find(int n,char[] ch) {
        // TODO: Implement logic here
        HashMap<Character , Integer> mp  = new HashMap<>();
        for(char x : ch) {
            mp.put(x, mp.getOrDefault(x , 0) + 1 );
        }

        for(char x : ch)
        {
            if((mp.get(x) % 2) != 0)
            {
                System.out.println(x);
                break;
            }
        }
    }
}