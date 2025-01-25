package Day10;

import java.util.*;

public class CSK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        char fc = str.charAt(0);
        char sc = str.charAt(1);
        for(int i = 2;i < n - 1;i++)
        {
            if(str.charAt(i) != fc && str.charAt(i + 1) != sc) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}