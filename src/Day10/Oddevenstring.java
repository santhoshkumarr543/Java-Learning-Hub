package Day10;

import java.util.*;

public class Oddevenstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        if((n % 2) == 0)
        {
            int mid = n / 2;
            System.out.println(str.charAt(mid - 1) + " " + str.charAt(mid));
        }
        else {
            System.out.println(str.charAt(n / 2));
        }
    }
}