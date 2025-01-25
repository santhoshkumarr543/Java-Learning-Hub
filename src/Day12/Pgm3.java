package Day12;

import java.util.*;

public class Pgm3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            String str = null;
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