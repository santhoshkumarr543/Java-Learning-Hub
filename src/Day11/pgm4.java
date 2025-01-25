package Day11;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class pgm4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        find(str, n);
    }

    public static void find(String str, int n) {
        // TODO: Implement logic here
        Pattern p = Pattern.compile("[^aeiou]");
        Matcher m = p.matcher(str);

        Pattern p1 = Pattern.compile("[aeiou]");
        Matcher m1 = p1.matcher(str);
        while(m.find())
        {
            System.out.print(m.group());
        }
        while(m1.find())
        {
            System.out.print(m1.group());
        }
    }
}