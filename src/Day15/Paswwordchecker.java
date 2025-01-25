package Day15;

import java.util.*;

public class Paswwordchecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        System.out.println(find(str, n));
    }

    public static int find(String str, int n) {
        if (n < 4) return 0;
        if (Character.isDigit(str.charAt(0))) {
            return 0;
        }

        int digit = 0;
        int slash = 0;
        int character = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(str.charAt(i))) {
                digit++;
            } else if (str.charAt(i) == '/') {
                slash++;
            } else if (Character.isLetter(str.charAt(i))) {
                character++;
            }
        }

        if (digit > 0 && slash == 0 && character > 0) return 1;

        return 0;
    }
}