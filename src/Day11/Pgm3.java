package Day11;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pgm3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        Pattern p = Pattern.compile("\\.");
        Matcher m = p.matcher(str);
        int x = 0;
        while(m.find())
        {
             x =n -  m.start() - 1;
        }
        System.out.println(x);
    }
}