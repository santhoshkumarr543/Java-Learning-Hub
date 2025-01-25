package Day11;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pgm8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int n = str.length();
        System.out.println(find(str, n));
    }

    public static String find(String str, int n) {
        // TODO: Implement logic here
        Pattern p = Pattern.compile("[^A-Za-z0-9_]+");
        Matcher m = p.matcher(str);

        while(m.find())
        {
            return "not found a match";
        }
        return "found a match";
    }
}