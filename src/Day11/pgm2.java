package Day11;

import java.util.*;
import java.util.regex.*;

public class pgm2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        find(str);
    }

    public static void find(String str) {
        String result = str.replaceAll("\\b0+(\\d)", "$1");

        System.out.println(result);
    }
}
