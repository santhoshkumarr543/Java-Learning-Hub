package Day13;

import java.util.*;

public class Strindexoutofbound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        try {
            String str = sc.next();
            int n = sc.nextInt();
            System.out.println(find(str, n));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static char find(String str, int n) {
        // TODO: Implement logic here
        return str.charAt(n);
    }
}