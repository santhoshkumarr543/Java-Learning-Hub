package Day10;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        find(str);
    }

    public static void find(String str) {
        // TODO: Implement logic here
        for(int i = 0;i < str.length()/2;i++)
        {
            if((str.charAt(i)) != (str.charAt(str.length() - 1 - i)))
            {
                System.out.println("Noo");
            }
            else {
                System.out.println("yes");
            }
        }
    }
}